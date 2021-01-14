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
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2ho  reason: invalid class name and case insensitive filesystem */
public class C55942ho extends AnonymousClass1B6 {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 2;
    public long A04;
    public SensorManager A05;
    public Location A06;
    public Display A07;
    public AnonymousClass1B5 A08;
    public boolean A09;
    public boolean A0A;
    public final SensorEventListener A0B = new AnonymousClass2SH(this);
    public final AbstractC24471Ay A0C = new C55932hn(this);
    public final AnonymousClass03P A0D;
    public final float[] A0E = new float[3];
    public final float[] A0F = new float[16];
    public final float[] A0G = new float[3];

    public C55942ho(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        AnonymousClass03P A002 = AnonymousClass03P.A00();
        this.A0D = A002;
        this.A05 = A002.A07();
        this.A07 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        A05(new C55622hI(this));
    }

    public void A06() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            boolean z = false;
            if (defaultSensor != null) {
                z = true;
            }
            this.A0A = z;
            if (defaultSensor != null) {
                this.A05.registerListener(this.A0B, defaultSensor, 1);
            }
        }
    }

    public void A07(int i) {
        if (this instanceof C60152ot) {
            C60152ot r1 = (C60152ot) this;
            if (i == 0) {
                LocationPicker2 locationPicker2 = r1.A00;
                locationPicker2.A08.A0S.setImageResource(R.drawable.btn_compass_mode_tilt);
                locationPicker2.A08.A0s = false;
            } else if (i == 1) {
                LocationPicker2 locationPicker22 = r1.A00;
                locationPicker22.A08.A0S.setImageResource(R.drawable.btn_myl_active);
                locationPicker22.A08.A0s = true;
            } else if (i == 2) {
                LocationPicker2 locationPicker23 = r1.A00;
                locationPicker23.A08.A0S.setImageResource(R.drawable.btn_myl);
                locationPicker23.A08.A0s = false;
            }
        } else if (this instanceof C60102on) {
            C60102on r2 = (C60102on) this;
            int i2 = 8;
            if (i == 0) {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = r2.A00;
                AbstractView$OnCreateContextMenuListenerC56112i5 r0 = groupChatLiveLocationsActivity2.A08;
                r0.A0u = true;
                r0.A0s = true;
                View view = r0.A0U;
                if (r0.A0m == null) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                groupChatLiveLocationsActivity2.A04.setImageResource(R.drawable.btn_compass_mode_tilt);
            } else if (i == 1) {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = r2.A00;
                AbstractView$OnCreateContextMenuListenerC56112i5 r02 = groupChatLiveLocationsActivity22.A08;
                r02.A0u = true;
                r02.A0s = true;
                View view2 = r02.A0U;
                if (r02.A0m == null) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                groupChatLiveLocationsActivity22.A04.setImageResource(R.drawable.btn_myl_active);
            } else if (i == 2) {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity23 = r2.A00;
                groupChatLiveLocationsActivity23.A04.setImageResource(R.drawable.btn_myl);
                groupChatLiveLocationsActivity23.A08.A0s = false;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A07(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setLocationMode(int i) {
        LatLng latLng;
        LatLng latLng2;
        int i2;
        AnonymousClass1B5 r7 = this.A08;
        if (r7 == null) {
            this.A03 = i;
            return;
        }
        CameraPosition A022 = r7.A02();
        if (i != 0) {
            if (i == 1) {
                Location location = this.A06;
                if (location != null) {
                    latLng2 = new LatLng(location.getLatitude(), this.A06.getLongitude());
                    this.A03 = 1;
                    i2 = 1;
                } else {
                    latLng2 = A022.A03;
                    this.A03 = 2;
                    i2 = 2;
                }
                A07(i2);
                r7.A08(C008805h.A0F(new CameraPosition(latLng2, A022.A02, 0.0f, 0.0f)));
            } else if (i == 2) {
                this.A03 = 2;
                A07(2);
            }
        } else if (this.A0A) {
            this.A01 = A022.A02;
            A07(0);
            Location location2 = this.A06;
            if (location2 != null) {
                latLng = new LatLng(location2.getLatitude(), this.A06.getLongitude());
            } else {
                latLng = A022.A03;
                if (latLng == null) {
                    return;
                }
            }
            float f = this.A00;
            double d = 50.0d / 6378137.0d;
            double radians = Math.toRadians((double) f);
            double radians2 = Math.toRadians(latLng.A00);
            double radians3 = Math.toRadians(latLng.A01);
            double cos = Math.cos(d);
            double sin = Math.sin(d);
            double sin2 = Math.sin(radians2);
            double cos2 = sin * Math.cos(radians2);
            double cos3 = (Math.cos(radians) * cos2) + (cos * sin2);
            CameraPosition cameraPosition = new CameraPosition(new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * cos2, cos - (sin2 * cos3)))), Math.max(this.A01, 15.0f), Math.max(Math.min(this.A02, 67.5f), 0.0f), f);
            this.A09 = true;
            r7.A0A(C008805h.A0F(cameraPosition), this.A0C);
            this.A03 = 0;
        }
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}
