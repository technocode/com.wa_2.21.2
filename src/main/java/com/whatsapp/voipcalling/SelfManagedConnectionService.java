package com.whatsapp.voipcalling;

import X.AbstractC003401r;
import X.AnonymousClass00E;
import X.AnonymousClass0AY;
import X.AnonymousClass3U7;
import X.C09200cS;
import X.C09210cT;
import X.C09220cU;
import X.C09230cV;
import X.C09250cY;
import X.C72713Ty;
import X.C74363ak;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

public class SelfManagedConnectionService extends ConnectionService {
    public final C09210cT A00 = C09210cT.A00();

    public void onCreate() {
        super.onCreate();
        Log.i("voip/SelfManagedConnectionService/onCreate");
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateIncomingConnection ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        Connection A02 = this.A00.A02().A02(connectionRequest, false);
        if (A02 != null) {
            return A02;
        }
        return Connection.createFailedConnection(new DisconnectCause(1));
    }

    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateIncomingConnectionFailed ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        C72713Ty A02 = this.A00.A02();
        AnonymousClass00E.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator it = ((AbstractC003401r) A02).A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    C09230cV r2 = (C09230cV) r1.next();
                    if (!(r2 instanceof C74363ak)) {
                        AnonymousClass00E.A01();
                    } else {
                        C74363ak r22 = (C74363ak) r2;
                        AnonymousClass00E.A01();
                        StringBuilder sb2 = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ");
                        sb2.append(string);
                        Log.i(sb2.toString());
                        if (string.equals(Voip.getCurrentCallId())) {
                            AnonymousClass3U7 r23 = r22.A00;
                            r23.A0J.removeMessages(1);
                            r23.A0j(string, "busy", 4);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateOutgoingConnection ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        Connection A02 = this.A00.A02().A02(connectionRequest, true);
        if (A02 != null) {
            return A02;
        }
        return Connection.createFailedConnection(new DisconnectCause(1));
    }

    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateOutgoingConnectionFailed ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        C72713Ty A02 = this.A00.A02();
        AnonymousClass00E.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator it = ((AbstractC003401r) A02).A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    C09230cV r5 = (C09230cV) r1.next();
                    if (!(r5 instanceof C09220cU)) {
                        AnonymousClass00E.A01();
                    } else {
                        C09220cU r52 = (C09220cU) r5;
                        AnonymousClass00E.A01();
                        C09200cS r4 = r52.A01;
                        C09250cY r2 = r4.A0L;
                        StringBuilder sb2 = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
                        sb2.append(string);
                        sb2.append(", pendingCallCommand: ");
                        sb2.append(r2);
                        Log.i(sb2.toString());
                        if (r2 != null && string.equals(r2.A03)) {
                            Log.w("app/startOutgoingCall/failed_no_cellular_call_in_progress");
                            Voip.CallState currentCallState = Voip.getCurrentCallState();
                            if (currentCallState == Voip.CallState.NONE) {
                                r52.A00.A04(R.string.can_not_start_voip_call_in_phone_call, 1);
                            } else if (currentCallState == Voip.CallState.ACTIVE_ELSEWHERE) {
                                r52.A00.A04(R.string.can_not_start_voip_call_when_active_elsewhere_message, 1);
                            } else {
                                r52.A00.A04(R.string.error_call_disabled_during_call, 1);
                            }
                            r4.A0L = null;
                            r4.A01.removeMessages(1);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("voip/SelfManagedConnectionService/onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onStartCommand ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onUnbind ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onUnbind(intent);
    }
}
