package com.facebook.redex;

import X.AbstractC007503q;
import X.AbstractC009505y;
import X.AbstractC51572Zg;
import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass0A6;
import X.AnonymousClass0AL;
import X.AnonymousClass0FI;
import X.AnonymousClass0OJ;
import X.AnonymousClass1XM;
import X.AnonymousClass28A;
import X.AnonymousClass2ZL;
import X.AnonymousClass2ZN;
import X.AnonymousClass33N;
import X.C002001d;
import X.C008805h;
import X.C010106g;
import X.C04360Kb;
import X.C12200hi;
import X.C26771Mj;
import X.C26781Mk;
import X.C42971xa;
import X.C42981xb;
import X.C43151xs;
import X.C43161xt;
import X.C53782dp;
import X.C53812ds;
import X.C71823Ql;
import android.content.Context;
import android.view.View;
import com.whatsapp.Conversation;
import com.whatsapp.MessageDetailsActivity;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewOnClickEBaseShape0S0201000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape0S0201000_I1(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C43161xt r2;
        int i;
        C26781Mk r1;
        switch (this.A03) {
            case 0:
                C26771Mj r4 = (C26771Mj) this.A01;
                View view2 = (View) this.A02;
                int i2 = this.A00;
                UserJid userJid = (UserJid) view2.getTag();
                UserJid userJid2 = r4.A00;
                if (userJid.equals(userJid2)) {
                    r4.A00 = null;
                } else {
                    r4.A00 = userJid;
                    if (((C26781Mk) r4.A02.A0U.get(i2)).A00() != 5) {
                        r4.A01(i2, view2, true);
                    } else {
                        r4.A00 = null;
                    }
                }
                if (userJid2 != null) {
                    MessageDetailsActivity messageDetailsActivity = r4.A02;
                    View findViewWithTag = messageDetailsActivity.A02.findViewWithTag(userJid2);
                    ArrayList arrayList = messageDetailsActivity.A0U;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r1 = (C26781Mk) it.next();
                            if (userJid2.equals(r1.A01)) {
                            }
                        } else {
                            r1 = null;
                        }
                    }
                    if (findViewWithTag != null && r1 != null) {
                        r4.A01(arrayList.indexOf(r1), findViewWithTag, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C43161xt r7 = (C43161xt) this.A01;
                C43151xs r42 = (C43151xs) this.A02;
                int i3 = this.A00;
                boolean z = false;
                try {
                    C43161xt r22 = r42.A06;
                    z = r22.A0C.getJSONObject(r42.A00()).optBoolean(r22.A06, false);
                } catch (JSONException unused) {
                }
                if (!z) {
                    try {
                        JSONObject jSONObject = r7.A0C.getJSONObject(i3);
                        AbstractC009505y r6 = r7.A02;
                        if (r6 != null) {
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, jSONObject.get(next).toString());
                            }
                            C42981xb r3 = r7.A03;
                            ArrayList arrayList2 = new ArrayList();
                            Map A012 = C42971xa.A01(hashMap);
                            if (arrayList2.size() == 0) {
                                arrayList2.add(C008805h.A0T(A012));
                                C008805h.A0P(r6, new C010106g(arrayList2), r3.A00);
                            } else {
                                throw new IllegalArgumentException("arguments have to be continuous");
                            }
                        }
                    } catch (JSONException e) {
                        StringBuilder A0S = AnonymousClass008.A0S("WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : ");
                        A0S.append(e.getMessage());
                        Log.e(A0S.toString());
                    }
                    boolean z2 = false;
                    try {
                        C43161xt r23 = r42.A06;
                        z2 = r23.A0C.getJSONObject(r42.A00()).optBoolean(r23.A06, false);
                    } catch (JSONException unused2) {
                    }
                    if (!z2 && (i = (r2 = r42.A06).A00) != r42.A00()) {
                        r2.A02(i);
                        int A002 = r42.A00();
                        r2.A00 = A002;
                        r2.A02(A002);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass1XM r24 = (AnonymousClass1XM) ((DynamicButtonsLayout) this.A01).A00.get(this.A00);
                AbstractC51572Zg r5 = ((AnonymousClass2ZL) this.A02).A00;
                Context A0O = C002001d.A0O(r5.getContext());
                if (A0O instanceof Conversation) {
                    Conversation conversation = (Conversation) A0O;
                    AbstractC007503q fMessage = r5.getFMessage();
                    C04360Kb r43 = conversation.A2K;
                    Jid A022 = conversation.A0z.A02(AnonymousClass02N.class);
                    if (A022 != null) {
                        AnonymousClass0AL r32 = r43.A12;
                        String str = r24.A01;
                        String str2 = r24.A02;
                        long A05 = r43.A0L.A05();
                        AnonymousClass0A6 r0 = r32.A07;
                        AnonymousClass28A r72 = new AnonymousClass28A(AnonymousClass0FI.A07(r0.A01, r0.A00, (AnonymousClass02N) A022, true), A05, str, str2);
                        r32.A05(r72, fMessage);
                        r43.A0K(r72);
                        r43.A0W.A0J(r72);
                        r5.A0K();
                        return;
                    }
                    throw null;
                }
                Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
                return;
            case 3:
                AnonymousClass0OJ r33 = (AnonymousClass0OJ) ((TemplateQuickReplyButtonsLayout) this.A01).A00.get(this.A00);
                AbstractC51572Zg r25 = ((AnonymousClass2ZN) this.A02).A00;
                Context A0O2 = C002001d.A0O(r25.getContext());
                if (A0O2 instanceof Conversation) {
                    Conversation conversation2 = (Conversation) A0O2;
                    AbstractC007503q fMessage2 = r25.getFMessage();
                    C04360Kb r44 = conversation2.A2K;
                    Jid A023 = conversation2.A0z.A02(AnonymousClass02N.class);
                    if (A023 != null) {
                        AnonymousClass02N r62 = (AnonymousClass02N) A023;
                        String A1l = C002001d.A1l(r33.A04);
                        String str3 = r33.A05;
                        int i4 = r33.A02;
                        if (r44 != null) {
                            Log.d("useractions/userActionSendTemplateButtonReplyMessage");
                            AnonymousClass0AL r34 = r44.A12;
                            long A052 = r44.A0L.A05();
                            AnonymousClass0A6 r02 = r34.A07;
                            C12200hi r63 = new C12200hi(AnonymousClass0FI.A07(r02.A01, r02.A00, r62, true), A052, A1l, str3, i4);
                            r34.A05(r63, fMessage2);
                            r44.A0K(r63);
                            r44.A0W.A0J(r63);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                return;
            case 4:
                RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment = (RoomsNUXBottomSheetDialogFragment) this.A01;
                roomsNUXBottomSheetDialogFragment.A01.A06((AnonymousClass02N) this.A02, this.A00);
                roomsNUXBottomSheetDialogFragment.A0w(false, false);
                return;
            case 5:
                C53812ds r35 = (C53812ds) this.A01;
                r35.A08((StorageUsageMediaGalleryFragment) r35.A04, (C53782dp) this.A02, this.A00);
                return;
            case 6:
                ((C71823Ql) this.A01).A01.A0o((AnonymousClass33N) this.A02, this.A00);
                return;
            default:
                return;
        }
    }
}
