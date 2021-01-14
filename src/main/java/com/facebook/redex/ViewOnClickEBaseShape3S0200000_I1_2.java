package com.facebook.redex;

import X.AbstractC676339k;
import X.AbstractC676639q;
import X.C007003k;
import X.C15730oZ;
import X.C15740oa;
import X.C15750ob;
import X.C73263Wc;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetDragIndicator;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;
import java.util.ArrayList;
import java.util.Set;
import org.npci.commonlibrary.NPCIFragment;

public class ViewOnClickEBaseShape3S0200000_I1_2 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape3S0200000_I1_2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        String str;
        UserJid of;
        switch (this.A02) {
            case 0:
                ((AbstractC676339k) this.A01).AE8(((VoipCallControlBottomSheetDragIndicator) this.A00).A00);
                return;
            case 1:
                VoipCallNewParticipantBanner voipCallNewParticipantBanner = (VoipCallNewParticipantBanner) this.A00;
                AbstractC676639q r1 = (AbstractC676639q) this.A01;
                C007003k r0 = voipCallNewParticipantBanner.A04;
                if (!(r0 == null || (of = UserJid.of(r0.A09)) == null)) {
                    r1.ADU(of);
                }
                voipCallNewParticipantBanner.A00();
                return;
            case 2:
                NPCIFragment nPCIFragment = (NPCIFragment) ((RunnableEBaseShape13S0100000_I1_8) this.A00).A00;
                nPCIFragment.A0r((C73263Wc) this.A01);
                Intent intent = new Intent("TRIGGER_OTP");
                C15750ob A002 = C15750ob.A00(nPCIFragment.A00());
                synchronized (A002.A04) {
                    String action = intent.getAction();
                    String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(A002.A00.getContentResolver());
                    Uri data = intent.getData();
                    String scheme = intent.getScheme();
                    Set<String> categories = intent.getCategories();
                    boolean z = false;
                    if ((intent.getFlags() & 8) != 0) {
                        z = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Resolving type ");
                        sb.append(resolveTypeIfNeeded);
                        sb.append(" scheme ");
                        sb.append(scheme);
                        sb.append(" of intent ");
                        sb.append(intent);
                        Log.v("LocalBroadcastManager", sb.toString());
                    }
                    ArrayList arrayList = (ArrayList) A002.A03.get(intent.getAction());
                    if (arrayList != null) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Action list: ");
                            sb2.append(arrayList);
                            Log.v("LocalBroadcastManager", sb2.toString());
                        }
                        ArrayList arrayList2 = null;
                        int i = 0;
                        while (i < arrayList.size()) {
                            C15740oa r11 = (C15740oa) arrayList.get(i);
                            if (z) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Matching against filter ");
                                sb3.append(r11.A03);
                                Log.v("LocalBroadcastManager", sb3.toString());
                            }
                            if (r11.A00) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter's target already added");
                                }
                                str = resolveTypeIfNeeded;
                            } else {
                                str = resolveTypeIfNeeded;
                                int match = r11.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                if (match >= 0) {
                                    if (z) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("  Filter matched!  match=0x");
                                        sb4.append(Integer.toHexString(match));
                                        Log.v("LocalBroadcastManager", sb4.toString());
                                    }
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(r11);
                                    r11.A00 = true;
                                } else if (z) {
                                    String str2 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("  Filter did not match: ");
                                    sb5.append(str2);
                                    Log.v("LocalBroadcastManager", sb5.toString());
                                }
                            }
                            i++;
                            resolveTypeIfNeeded = str;
                        }
                        if (arrayList2 != null) {
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                ((C15740oa) arrayList2.get(i2)).A00 = false;
                            }
                            A002.A02.add(new C15730oZ(intent, arrayList2));
                            Handler handler = A002.A01;
                            if (!handler.hasMessages(1)) {
                                handler.sendEmptyMessage(1);
                            }
                            return;
                        }
                    }
                    return;
                }
            default:
                return;
        }
    }
}
