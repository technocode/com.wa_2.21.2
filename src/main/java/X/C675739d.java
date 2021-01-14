package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;

/* renamed from: X.39d  reason: invalid class name and case insensitive filesystem */
public class C675739d implements BluetoothProfile.ServiceListener {
    public WeakReference A00;

    public C675739d(C675939f r3) {
        StringBuilder sb = new StringBuilder("voip/audio_route/BluetoothProfileListener created");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00 = new WeakReference(r3);
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C675939f r2 = (C675939f) this.A00.get();
        if (r2 == null || r2.A05) {
            StringBuilder sb = new StringBuilder("voip/audio_route/BluetoothProfileListener/onServiceConnected VoipAudioManager already Destroyed ");
            sb.append(r2);
            Log.w(sb.toString());
        } else if (i == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            r2.A03 = bluetoothHeadset;
            StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/BluetoothProfileListener/onServiceConnected ");
            A0S.append(bluetoothHeadset);
            A0S.append(", devices: ");
            A0S.append(r2.A03.getConnectedDevices());
            A0S.append(", ");
            A0S.append(r2);
            Log.i(A0S.toString());
            r2.A00(Voip.getCallInfo());
        }
    }

    public void onServiceDisconnected(int i) {
        C675939f r2 = (C675939f) this.A00.get();
        if (r2 == null || r2.A05) {
            StringBuilder sb = new StringBuilder("voip/audio_route/BluetoothProfileListener/onServiceDisconnected VoipAudioManager already Destroyed ");
            sb.append(r2);
            Log.w(sb.toString());
        } else if (i == 1) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/BluetoothProfileListener/onServiceDisconnected ");
            A0S.append(r2.A03);
            A0S.append(", ");
            A0S.append(r2);
            Log.i(A0S.toString());
            r2.A03 = null;
            r2.A04(false, Voip.getCallInfo());
        }
    }
}
