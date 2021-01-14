package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

public interface INotificationSideChannel extends IInterface {
    void A2Y(String str, int i, String str2);

    void ACT(String str, int i, String str2, Notification notification);
}
