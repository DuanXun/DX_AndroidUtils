package com.dx.android_utils;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by duanx on 2017/5/15.
 * activity控制工具类
 */

public class ActivityController {

    private static Stack<Activity> mActivities = new Stack<>();

    public static void addActivity(Activity activity){
        mActivities.add(activity);
    }

    public static void removeActivity(Activity activity){
        mActivities.remove(activity);
    }

    public static void finishAllActivity(){
        try {
            for (int i = 0; i < mActivities.size(); i++) {
                if (null != mActivities.get(i)) {
                    mActivities.get(i).finish();
                }
            }
            mActivities.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
