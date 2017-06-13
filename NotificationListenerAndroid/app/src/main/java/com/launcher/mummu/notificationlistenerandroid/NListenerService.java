package com.launcher.mummu.notificationlistenerandroid;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/**
 * Created by muhammed on 2/15/2017.
 */


public class NListenerService extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String packageName = sbn.getNotification().tickerText.toString();
        if (sbn.getPackageName().equalsIgnoreCase("com.whatsapp")) {
            Log.d("NOTIFICATION_LISTENER", "onNotificationPosted: Whatsapp : " + packageName);
        } else {
            Log.d("NOTIFICATION_LISTENER", "onNotificationPosted : " + packageName);
        }
        super.onNotificationPosted(sbn);
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {

    }
}
