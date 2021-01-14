package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1QU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QU extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View.OnClickListener A02;
    public final /* synthetic */ View.OnClickListener A03;
    public final /* synthetic */ C41451v4 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass1QU(C41451v4 r1, int i, boolean z, String str, View.OnClickListener onClickListener, int i2, View.OnClickListener onClickListener2) {
        this.A04 = r1;
        this.A00 = i;
        this.A06 = z;
        this.A05 = str;
        this.A02 = onClickListener;
        this.A01 = i2;
        this.A03 = onClickListener2;
    }

    public final void run() {
        C41451v4 r1 = this.A04;
        int i = this.A00;
        boolean z = this.A06;
        String str = this.A05;
        View.OnClickListener onClickListener = this.A02;
        int i2 = this.A01;
        View.OnClickListener onClickListener2 = this.A03;
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    Log.i("settings-gdrive/set-message/show-backup-button");
                    SettingsGoogleDrive settingsGoogleDrive = r1.A03;
                    settingsGoogleDrive.A0A.setVisibility(0);
                    settingsGoogleDrive.A0D.setVisibility(8);
                    settingsGoogleDrive.A0B.setVisibility(8);
                    settingsGoogleDrive.A0C.setVisibility(8);
                    settingsGoogleDrive.A0G.setVisibility(8);
                    settingsGoogleDrive.A0A.setOnClickListener(settingsGoogleDrive.A03);
                    settingsGoogleDrive.A0X();
                }
                if (str != null) {
                    throw new IllegalArgumentException("message should be null when button has to be displayed.");
                }
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
                if (str != null) {
                    if (z) {
                        SettingsGoogleDrive settingsGoogleDrive2 = r1.A03;
                        settingsGoogleDrive2.A0A.setVisibility(8);
                        settingsGoogleDrive2.A0D.setVisibility(0);
                        settingsGoogleDrive2.A0D.setIndeterminate(true);
                        settingsGoogleDrive2.A0B.setOnClickListener(onClickListener);
                        ImageView imageView = settingsGoogleDrive2.A0B;
                        if (onClickListener != null) {
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                        }
                        ImageView imageView2 = settingsGoogleDrive2.A0C;
                        if (onClickListener2 != null) {
                            imageView2.setVisibility(0);
                        } else {
                            imageView2.setVisibility(8);
                        }
                        settingsGoogleDrive2.A0C.setOnClickListener(onClickListener2);
                        settingsGoogleDrive2.A0G.setVisibility(0);
                    }
                    AnonymousClass008.A18("settings-gdrive/set-message ", str);
                    r1.A03.A0G.setText(str);
                    return;
                }
                throw null;
            } else if (str != null) {
                if (z) {
                    Log.i("settings-gdrive/set-message/show-determinate");
                    SettingsGoogleDrive settingsGoogleDrive3 = r1.A03;
                    settingsGoogleDrive3.A0A.setVisibility(8);
                    settingsGoogleDrive3.A0D.setVisibility(0);
                    settingsGoogleDrive3.A0D.setIndeterminate(false);
                    settingsGoogleDrive3.A0B.setOnClickListener(onClickListener);
                    ImageView imageView3 = settingsGoogleDrive3.A0B;
                    if (onClickListener != null) {
                        imageView3.setVisibility(0);
                    } else {
                        imageView3.setVisibility(8);
                    }
                    settingsGoogleDrive3.A0G.setVisibility(0);
                }
                if (i2 >= 0) {
                    r1.A03.A0D.setProgress(i2);
                }
                SettingsGoogleDrive settingsGoogleDrive4 = r1.A03;
                settingsGoogleDrive4.A0G.setText(str);
                settingsGoogleDrive4.A0C.setOnClickListener(onClickListener2);
                ImageView imageView4 = settingsGoogleDrive4.A0C;
                if (onClickListener2 != null) {
                    imageView4.setVisibility(0);
                } else {
                    imageView4.setVisibility(8);
                }
            } else {
                throw null;
            }
        } else if (z) {
            Log.i("settings-gdrive/set-message/show-nothing");
            SettingsGoogleDrive settingsGoogleDrive5 = r1.A03;
            settingsGoogleDrive5.A0A.setVisibility(8);
            settingsGoogleDrive5.A0D.setVisibility(8);
            settingsGoogleDrive5.A0B.setVisibility(8);
            settingsGoogleDrive5.A0C.setVisibility(8);
            settingsGoogleDrive5.A0G.setVisibility(8);
        }
    }
}
