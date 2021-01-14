package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.SelfManagedConnectionService;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.3Ty  reason: invalid class name and case insensitive filesystem */
public class C72713Ty extends AbstractC003401r {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final TelecomManager A02;
    public final AnonymousClass01X A03;
    public final C09270cb A04;
    public final ConcurrentMap A05 = new ConcurrentHashMap();
    public volatile boolean A06;

    public C72713Ty(AnonymousClass03P r2, AnonymousClass01X r3, C09270cb r4) {
        this.A02 = r2.A0D();
        this.A03 = r3;
        this.A04 = r4;
    }

    public static final Uri A00(UserJid userJid) {
        String A13 = C001801b.A13(C12420i4.A02(userJid));
        if (A13 != null) {
            return Uri.fromParts("tel", A13, "");
        }
        Log.i("voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number");
        return null;
    }

    public static final Bundle A01(String str, UserJid userJid, String str2, boolean z, boolean z2) {
        String str3;
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("call_id", str);
        bundle2.putString("peer_jid", userJid.getRawString());
        bundle2.putString("peer_display_name", str2);
        if (z2) {
            str3 = "android.telecom.extra.OUTGOING_CALL_EXTRAS";
        } else {
            str3 = "android.telecom.extra.INCOMING_CALL_EXTRAS";
        }
        bundle.putParcelable(str3, bundle2);
        return bundle;
    }

    public Connection A02(ConnectionRequest connectionRequest, boolean z) {
        Bundle bundle;
        AnonymousClass00E.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras == null) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ");
            sb.append(connectionRequest);
            Log.i(sb.toString());
            return null;
        }
        if (!z) {
            bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
            if (bundle == null) {
                StringBuilder sb2 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ");
                sb2.append(connectionRequest);
                Log.i(sb2.toString());
                return null;
            }
        } else {
            bundle = extras;
        }
        String string = bundle.getString("call_id");
        UserJid nullable = UserJid.getNullable(bundle.getString("peer_jid"));
        String string2 = bundle.getString("peer_display_name");
        if (string == null || nullable == null || string2 == null) {
            StringBuilder sb3 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ");
            sb3.append(connectionRequest);
            Log.i(sb3.toString());
            return null;
        }
        AnonymousClass39G r4 = new AnonymousClass39G(this, string);
        r4.setConnectionProperties(128);
        r4.setAddress(connectionRequest.getAddress(), 1);
        r4.setCallerDisplayName(string2, 1);
        r4.setConnectionCapabilities(r4.getConnectionCapabilities() | 2);
        r4.setVideoState(connectionRequest.getVideoState());
        r4.setExtras(extras);
        StringBuilder sb4 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
        sb4.append(nullable);
        sb4.append(", call id: ");
        sb4.append(string);
        sb4.append(", isOutgoing ");
        sb4.append(z);
        Log.i(sb4.toString());
        A04(r4);
        Iterator it = super.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (!r1.hasNext()) {
                return r4;
            }
            C09230cV r2 = (C09230cV) r1.next();
            if (z) {
                r2.A00(string);
            } else if (!(r2 instanceof C74363ak)) {
                AnonymousClass00E.A01();
            } else {
                C74363ak r22 = (C74363ak) r2;
                AnonymousClass00E.A01();
                StringBuilder sb5 = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ");
                sb5.append(string);
                Log.i(sb5.toString());
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo == null || (!string.equals(callInfo.callId) && !string.equals(callInfo.callWaitingInfo.A04))) {
                    r22.A00.A1v.A02().A06(string);
                } else {
                    AnonymousClass3U7 r23 = r22.A00;
                    r23.A0J.removeMessages(1);
                    Handler handler = r23.A0J;
                    handler.sendMessageDelayed(handler.obtainMessage(28, string), 500);
                }
            }
        }
    }

    public void A03() {
        AnonymousClass00E.A01();
        ConcurrentMap concurrentMap = this.A05;
        if (!concurrentMap.isEmpty()) {
            Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
            Iterator it = new ArrayList(concurrentMap.values()).iterator();
            while (it.hasNext()) {
                ((AnonymousClass39G) it.next()).A00(2);
            }
            AnonymousClass00E.A08(concurrentMap.isEmpty(), "all connection should have been removed");
        }
    }

    public void A04(AnonymousClass39G r4) {
        AnonymousClass00E.A01();
        ConcurrentMap concurrentMap = this.A05;
        concurrentMap.put(r4.A01, r4);
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A05(AnonymousClass39G r4) {
        AnonymousClass00E.A01();
        ConcurrentMap concurrentMap = this.A05;
        concurrentMap.remove(r4.A01);
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/removeConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A06(String str) {
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass39G r1 = (AnonymousClass39G) this.A05.get(str);
        if (r1 != null) {
            r1.A00(2);
        }
    }

    public void A07(String str, int i) {
        AnonymousClass00E.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                C09230cV r4 = (C09230cV) r1.next();
                if (!(r4 instanceof C74363ak)) {
                    AnonymousClass00E.A01();
                } else {
                    C74363ak r42 = (C74363ak) r4;
                    AnonymousClass00E.A01();
                    StringBuilder sb = new StringBuilder("voip/service/selfManagedConnectionListener/onConnectionStateChanged ");
                    sb.append(str);
                    sb.append(", state ");
                    sb.append(i);
                    Log.i(sb.toString());
                    CallInfo callInfo = Voip.getCallInfo();
                    if (Voip.A09(callInfo) && str.equals(callInfo.callId)) {
                        if (i == 0) {
                            r42.A00.A0X(callInfo, true);
                        } else if (i == 1) {
                            r42.A00.A0X(callInfo, false);
                        } else if (i == 2) {
                            AnonymousClass3U7 r12 = r42.A00;
                            r12.A0q = true;
                            r12.A0p(callInfo);
                            r12.A0g(callInfo.callId, 3);
                        } else if (i == 3) {
                            Integer A012 = Voip.A01("options.ignore_telecom_reject_threshold_duration");
                            AnonymousClass3U7 r6 = r42.A00;
                            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - r6.A0B);
                            r6.A0h = valueOf;
                            StringBuilder A0S = AnonymousClass008.A0S("VoiceService/onConnectionStateChanged Time elapsed since SelfManagedConnection creation = ");
                            A0S.append(valueOf);
                            Log.d(A0S.toString());
                            if (A012 == null || r6.A0h.longValue() >= ((long) A012.intValue())) {
                                r6.A0j(str, null, 4);
                            } else {
                                Log.d("VoiceService/onConnectionStateChanged Ignoring SelfManagedConnection.Reject");
                                if (!r6.A0w) {
                                    Log.d("VoiceService/onConnectionStateChanged SelfManagedConnection has not shown UI. Showing now");
                                    r6.A0p(callInfo);
                                }
                            }
                        } else if (i != 4) {
                            AnonymousClass00E.A08(false, "unknown SelfManagedConnection.StateChange");
                        } else {
                            r42.A00.A0Q(1, null);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public boolean A08(Context context, UserJid userJid) {
        AnonymousClass00E.A01();
        if (this.A00 != null) {
            return true;
        }
        TelecomManager telecomManager = this.A02;
        if (telecomManager == null) {
            Log.w("voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null");
            return false;
        }
        Uri A002 = A00(userJid);
        if (A002 == null) {
            Log.w("voip/SelfManagedConnectionsManager/registerPhoneAccount address is null");
            return false;
        }
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/registerPhoneAccount ");
        sb.append(userJid);
        Log.i(sb.toString());
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(context, SelfManagedConnectionService.class), userJid.getRawString());
        this.A00 = phoneAccountHandle;
        AnonymousClass01X r2 = this.A03;
        PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, r2.A06(R.string.whatsapp_name)).addSupportedUriScheme("tel").setAddress(A002).setCapabilities(3080).setShortDescription(r2.A06(R.string.voip_phone_account_description));
        if (Build.VERSION.SDK_INT >= 28) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
            shortDescription.setExtras(bundle);
        }
        try {
            telecomManager.registerPhoneAccount(shortDescription.build());
            return true;
        } catch (SecurityException e) {
            Log.e(e);
            this.A00 = null;
            return false;
        }
    }
}
