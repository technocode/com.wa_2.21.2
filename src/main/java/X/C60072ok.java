package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2ok  reason: invalid class name and case insensitive filesystem */
public class C60072ok extends C32061eH {
    public float A00;
    public float A01;
    public int A02 = 2;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public C32031eE A06;
    public boolean A07;
    public final SensorEventListener A08 = new AnonymousClass2SF(this);
    public final AbstractC19240uh A09 = new C55612hH(this);
    public final AnonymousClass03P A0A;
    public final float[] A0B = new float[3];
    public final float[] A0C = new float[16];
    public final float[] A0D = new float[3];

    public C60072ok(Context context, C19130uW r5) {
        super(context, r5);
        AnonymousClass03P A002 = AnonymousClass03P.A00();
        this.A0A = A002;
        this.A04 = A002.A07();
        this.A05 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public C32031eE A0L(AbstractC19240uh r2) {
        AnonymousClass00E.A01();
        C32031eE r0 = this.A06;
        if (r0 != null) {
            r2.AHR(r0);
            return this.A06;
        }
        A0H(r2);
        return null;
    }

    public void A0M() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            boolean z = false;
            if (defaultSensor != null) {
                z = true;
            }
            this.A07 = z;
            if (defaultSensor != null) {
                this.A04.registerListener(this.A08, defaultSensor, 16000);
            }
        }
    }

    public void A0N(int i) {
        if (this instanceof C60582pl) {
            C60582pl r1 = (C60582pl) this;
            if (i == 0) {
                LocationPicker locationPicker = r1.A00;
                locationPicker.A09.A0S.setImageResource(R.drawable.btn_compass_mode_tilt);
                locationPicker.A09.A0s = false;
            } else if (i == 1) {
                LocationPicker locationPicker2 = r1.A00;
                locationPicker2.A09.A0S.setImageResource(R.drawable.btn_myl_active);
                locationPicker2.A09.A0s = true;
            } else if (i == 2) {
                LocationPicker locationPicker3 = r1.A00;
                locationPicker3.A09.A0S.setImageResource(R.drawable.btn_myl);
                locationPicker3.A09.A0s = false;
            }
        } else if (this instanceof C60572pk) {
            C60572pk r2 = (C60572pk) this;
            int i2 = 8;
            if (i == 0) {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = r2.A00;
                AbstractView$OnCreateContextMenuListenerC56112i5 r0 = groupChatLiveLocationsActivity.A07;
                r0.A0u = true;
                r0.A0s = true;
                groupChatLiveLocationsActivity.A03.setImageResource(R.drawable.btn_compass_mode_tilt);
                AbstractView$OnCreateContextMenuListenerC56112i5 r02 = groupChatLiveLocationsActivity.A07;
                View view = r02.A0U;
                if (r02.A0m == null) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            } else if (i == 1) {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = r2.A00;
                AbstractView$OnCreateContextMenuListenerC56112i5 r03 = groupChatLiveLocationsActivity2.A07;
                r03.A0u = true;
                r03.A0s = true;
                groupChatLiveLocationsActivity2.A03.setImageResource(R.drawable.btn_myl_active);
                AbstractView$OnCreateContextMenuListenerC56112i5 r04 = groupChatLiveLocationsActivity2.A07;
                View view2 = r04.A0U;
                if (r04.A0m == null) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
            } else if (i == 2) {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity3 = r2.A00;
                groupChatLiveLocationsActivity3.A03.setImageResource(R.drawable.btn_myl);
                groupChatLiveLocationsActivity3.A07.A0s = false;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0N(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A02;
    }

    public Location getMyLocation() {
        C32031eE A0L = A0L(this.A09);
        if (A0L == null || !A0L.A0N || A0L.A0H == null) {
            return null;
        }
        return A0L.A0U.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r8 != null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r12) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60072ok.setLocationMode(int):void");
    }
}
