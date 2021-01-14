package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.39e  reason: invalid class name and case insensitive filesystem */
public class C675839e extends BroadcastReceiver {
    public final /* synthetic */ C675939f A00;

    public static final String A00(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN BLUETOOTH SCO STATE" : "CONNECTING" : "CONNECTED" : "DISCONNECTED" : "ERROR";
    }

    public C675839e(C675939f r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        BluetoothHeadset bluetoothHeadset;
        AnonymousClass00E.A01();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            C675939f r1 = this.A00;
            int i = r1.A01;
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            r1.A01 = intExtra;
            StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A0S.append(A00(i));
            A0S.append(" -> ");
            A0S.append(A00(intExtra));
            A0S.append("]");
            Log.i(A0S.toString());
            CallInfo callInfo = Voip.getCallInfo();
            int i2 = r1.A01;
            if (i2 == 0) {
                if (i == 2 || i == 1) {
                    r1.A04(false, callInfo);
                    r1.A01(callInfo);
                }
            } else if (i2 == 1 && (bluetoothHeadset = r1.A03) != null) {
                for (BluetoothDevice bluetoothDevice : bluetoothHeadset.getConnectedDevices()) {
                    if (r1.A03.isAudioConnected(bluetoothDevice)) {
                        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                        StringBuilder A0S2 = AnonymousClass008.A0S("voip/audio_route/bluetoothScoReceiver device name: ");
                        A0S2.append(bluetoothDevice.getName());
                        A0S2.append(", device class:");
                        A0S2.append(bluetoothClass.getDeviceClass());
                        A0S2.append(", major class: ");
                        A0S2.append(bluetoothClass.getMajorDeviceClass());
                        A0S2.append(", supports AUDIO: ");
                        A0S2.append(bluetoothClass.hasService(2097152));
                        A0S2.append(", supports TELEPHONY: ");
                        A0S2.append(bluetoothClass.hasService(4194304));
                        A0S2.append(", address: ");
                        A0S2.append(bluetoothDevice.getAddress());
                        Log.i(A0S2.toString());
                    }
                }
            }
            r1.A03(callInfo);
        }
    }
}
