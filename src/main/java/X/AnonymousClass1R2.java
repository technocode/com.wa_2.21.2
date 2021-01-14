package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1R2  reason: invalid class name */
public class AnonymousClass1R2 implements ServiceConnection {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public AnonymousClass1R2(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        settingsGoogleDrive.A0K = ((BinderC27531Qj) iBinder).A00;
        C09080cG r1 = settingsGoogleDrive.A0S;
        if (!r1.A0A) {
            r1.A03();
        }
        settingsGoogleDrive.A0g.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 21));
        settingsGoogleDrive.A0O.open();
        settingsGoogleDrive.A0X();
        Log.i("settings-gdrive/service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        settingsGoogleDrive.A0K = null;
        settingsGoogleDrive.A0O.close();
        Log.i("settings-gdrive/service-disconnected");
    }
}
