package com.launcher.mummu.notificationlistenerandroid;

import android.annotation.SuppressLint;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.support.annotation.RequiresApi;
import android.util.Log;

/**
 * Created by muhammed on 2/15/2017.
 */

@SuppressLint("OverrideAbstract")
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
public class NListenerService extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String packageName = sbn.getNotification().tickerText.toString();
        Log.d("NOTIFICATION_LISTENER", "onNotificationPosted: " + packageName);
        super.onNotificationPosted(sbn);
    }
}
