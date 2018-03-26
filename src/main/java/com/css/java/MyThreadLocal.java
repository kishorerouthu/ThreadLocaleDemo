package com.css.java;

/**
 * This class encloses the ThreadLocale object which contains it's
 * own value of Context for each thread
 *
 * @author Kishore Routhu on 13/7/17 1:34 PM.
 */
public class MyThreadLocal {

    private static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>();

    public static void set(Context context) {
        threadLocal.set(context);
    }

    public static Context get() {
        return threadLocal.get();
    }

    public static void unset() {
        threadLocal.remove();
    }
}
