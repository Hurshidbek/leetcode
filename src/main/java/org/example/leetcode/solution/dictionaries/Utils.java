package org.example.leetcode.solution.dictionaries;

import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.*;

public class Utils {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long pow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base;
            }
            base = base * base;
            exp >>= 1;
        }
        return result;
    }

    public static long modPow(long base, long exp, int modulo) {
        long result = 1;
        base = base % modulo;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % modulo;
            }
            base = (base * base) % modulo;
            exp >>= 1;
        }
        return result;
    }


    public static boolean isEmpty(String str) {
        return !StringUtils.hasText(str);
    }

    public static boolean isEmpty(Object obj) {
        return obj == null;
    }

    public static boolean isEmpty(Collection<?> col) {
        return col == null || col.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isPresent(String str) {
        return StringUtils.hasText(str);
    }

    public static boolean isPresent(Object obj) {
        return obj != null;
    }

    public static boolean isPresent(Long val) {
        return val != null && val != 0;
    }

    public static boolean isPresent(Collection<?> col) {
        return col != null && !col.isEmpty();
    }

    public static boolean isPresent(Map<?, ?> map) {
        return map != null && !map.isEmpty();
    }


    public static void executeMethod(String methodName, List<TestCase> testCases) {

        for (TestCase testCase : testCases) {

            Class[] paramTypes = new Class[testCase.getParams().size()];
            for (int i = 0; i < testCase.getParams().size(); i++) {
                paramTypes[i] = (findType(testCase.getParams().get(i)));
            }

            Object[] params = new Object[testCase.getParams().size()];
            for (int i = 0; i < testCase.getParams().size(); i++) {
                params[i] = Utils.castToType(testCase.getParams().get(i));
            }

            var result = Utils.invokeMethod(
                    printCallerClass(),
                    methodName,
                    paramTypes,
                    params);

            if (equals(Utils.castToType(testCase.getResult()), result)) {
                System.out.println(true + printParams(testCase.getParams()));
                ;
            } else {
                System.out.println(false + " -> " + printResult(result) + printParams(testCase.getParams())); // todo sout
            }

        }
    }

    public static String printResult(Object obj) {
        StringBuilder sb = new StringBuilder("");

        Class type = toWrapper(findType(obj));
        if (String.class.equals(type)
                || Integer.class.equals(type)
                || Double.class.equals(type)
                || Character.class.equals(type)
                || Long.class.equals(type)
                || Boolean.class.equals(type)
                || List.class.equals(type)
                || Map.class.equals(type)
                || Set.class.equals(type)
        ) {
            sb.append(obj.toString());
        } else if (int[].class.equals(type)
                || String[].class.equals(type)) {
            sb.append(Arrays.toString((Object[]) obj));
        } else if (TreeNode.class.equals(type)) {
            sb.append(TreeNode.toString((TreeNode) obj));
        } else if (ListNode.class.equals(type)) {
            sb.append(ListNode.toString((ListNode) obj));
        }
        return sb.toString();
    }

    public static String printParams(List<Object> params) {
        StringBuilder sb = new StringBuilder("\t(");
        for (Object obj : params) {

            Class type = toWrapper(findType(obj));
            if (String.class.equals(type)
                    || Integer.class.equals(type)
                    || Double.class.equals(type)
                    || Character.class.equals(type)
                    || Long.class.equals(type)
                    || Boolean.class.equals(type)
                    || List.class.equals(type)
                    || Map.class.equals(type)
                    || Set.class.equals(type)
            ) {
                sb.append(obj.toString());
            } else if (int[].class.equals(type)) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (TreeNode.class.equals(type)) {
                sb.append(TreeNode.toString((TreeNode) obj));
            } else if (ListNode.class.equals(type)) {
                sb.append(ListNode.toString((ListNode) obj));
            }

            sb.append(" || ");
        }
        if (sb.length() > 1) sb = new StringBuilder(sb.substring(0, sb.length() - 4));
        return sb.append(")").toString();

    }

    public static Boolean equals(Object obj1, Object obj2) {
        if (obj1 == obj2) return true;
        if (obj1 == null || obj2 == null) return false;

        if (obj1 instanceof Number && obj2 instanceof Number) {
            return ((Number) obj1).longValue() == ((Number) obj2).longValue();
        }

        return obj1.equals(obj2);
    }

    public static Object invokeMethod(String className, String methodName, Class<?>[] paramTypes, Object[] params) {
        try {
            // Class instance
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getDeclaredConstructor().newInstance();

            // Method0
//            Method method = null;
//            for (Method declaredMethod : clazz.getDeclaredMethods()) {
//                if (declaredMethod.getName().equals(methodName)
//                        && declaredMethod.getParameterCount() == paramTypes.length) {
//                    for (int i = 0; i < declaredMethod.getParameterTypes().length; i++) {
//                        if (){
//
//                        }
//                    }
//                    ;
//                    System.out.println();
//                    method = clazz.getDeclaredMethod(methodName, paramTypes);
//                }
//            }
//            assert method != null;

            Method method = clazz.getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true); // if method is private

            // Invoke
            return method.invoke(instance, params);
        } catch (NoSuchMethodException ex) {
            System.out.println();
            throw new RuntimeException("Reflection invocation failed: " + ex.getMessage(), ex);
        } catch (Exception ex) {
            throw new RuntimeException("Reflection invocation failed: " + ex.getMessage(), ex);
        }
    }

    public static String printCallerClass() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace[stackTrace.length - 1].getClassName();
    }

    public static <T> T castToType(Object obj) {
        Class type = toWrapper(findType(obj));

        if (type.isInstance(obj)) {
            return (T) obj;
        } else {
            throw new ClassCastException("Can't cast " + obj.getClass() + " to " + type);
        }
    }

    public static Class findType(Object obj) {
        if (obj == null) return null;

        if (obj instanceof String) {
            return String.class;
        } else if (obj instanceof Integer) {
            return int.class;
        } else if (obj instanceof Double) {
            return Double.class;
        } else if (obj instanceof Character) {
            return Character.class;
        } else if (obj instanceof Long) {
            return Long.class;
        } else if (obj instanceof Boolean) {
            return Boolean.class;
        } else if (obj instanceof int[]) {
            return int[].class;
        } else if (obj instanceof String[]) {
            return String[].class;
        } else if (obj instanceof List<?>) {
            return List.class;
        } else if (obj instanceof Map<?, ?>) {
            return Map.class;
        } else if (obj instanceof Set<?>) {
            return Set.class;
        } else if (obj instanceof TreeNode) {
            return TreeNode.class;
        } else if (obj instanceof ListNode) {
            return ListNode.class;
        } else {
            throw new ClassCastException("Can't cast " + obj.getClass() + " to " + obj);
        }
    }

    public static Class<?> toWrapper(Class<?> type) {
        if (!type.isPrimitive()) {
            return type;
        } else if (type == int.class) {
            return Integer.class;
        } else if (type == double.class) {
            return Double.class;
        } else if (type == boolean.class) {
            return Boolean.class;
        } else if (type == char.class) {
            return Character.class;
        } else if (type == long.class) {
            return Long.class;
        } else if (type == float.class) {
            return Float.class;
        } else if (type == short.class) {
            return Short.class;
        } else if (type == byte.class) {
            return Byte.class;
        } else {
            return type;
        }
    }

}
