package org.example.leetcode.solution.dictionaries;

import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

            if (Utils.castToType(testCase.getResult()).equals(result)) {
                System.out.println(true);
            } else {
                System.out.println("false -> " + result); // todo sout
            }

        }
    }

    public static Object invokeMethod(String className, String methodName, Class<?>[] paramTypes, Object[] params) {
        try {
            // Class instance
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getDeclaredConstructor().newInstance();

            // Method0
            Method method = clazz.getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true); // if method is private

            // Invoke
            return method.invoke(instance, params);
        } catch (Exception e) {
            throw new RuntimeException("Reflection invocation failed: " + e.getMessage(), e);
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
        } else if (obj instanceof List<?>) {
            return List.class;
        } else if (obj instanceof Map<?, ?>) {
            return Map.class;
        } else if (obj instanceof Set<?>) {
            return Set.class;
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
