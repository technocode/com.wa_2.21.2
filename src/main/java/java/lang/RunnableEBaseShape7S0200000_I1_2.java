package java.lang;

import X.AbstractC007503q;
import X.AbstractC009505y;
import X.AbstractC11910hD;
import X.AbstractC16370ph;
import X.AbstractC28161Td;
import X.AbstractC48432Mf;
import X.AbstractC51572Zg;
import X.AbstractC51922aG;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.ActivityC03630Ha;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03E;
import X.AnonymousClass05l;
import X.AnonymousClass05q;
import X.AnonymousClass05r;
import X.AnonymousClass09H;
import X.AnonymousClass0A8;
import X.AnonymousClass0AR;
import X.AnonymousClass0B3;
import X.AnonymousClass0C4;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0FI;
import X.AnonymousClass0FS;
import X.AnonymousClass0JW;
import X.AnonymousClass0M3;
import X.AnonymousClass0M5;
import X.AnonymousClass0MM;
import X.AnonymousClass0OS;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QU;
import X.AnonymousClass0QZ;
import X.AnonymousClass0RN;
import X.AnonymousClass0SE;
import X.AnonymousClass0YW;
import X.AnonymousClass0ZA;
import X.AnonymousClass1T0;
import X.AnonymousClass1V4;
import X.AnonymousClass1VI;
import X.AnonymousClass1VY;
import X.AnonymousClass1XJ;
import X.AnonymousClass21U;
import X.AnonymousClass2C0;
import X.AnonymousClass2E4;
import X.AnonymousClass2F8;
import X.AnonymousClass2FF;
import X.AnonymousClass2K7;
import X.AnonymousClass2PR;
import X.AnonymousClass2WW;
import X.AnonymousClass2WY;
import X.AnonymousClass2Wh;
import X.AnonymousClass2X5;
import X.AnonymousClass2XP;
import X.AnonymousClass2XR;
import X.AnonymousClass2XS;
import X.AnonymousClass2cX;
import X.AnonymousClass3L9;
import X.C007003k;
import X.C007303n;
import X.C008805h;
import X.C010106g;
import X.C014408c;
import X.C015808q;
import X.C016909b;
import X.C02270Bi;
import X.C02320Bn;
import X.C02430Bz;
import X.C04360Kb;
import X.C05440On;
import X.C06330Su;
import X.C08560bL;
import X.C12310ht;
import X.C28071St;
import X.C28131Ta;
import X.C29241Xq;
import X.C41191ud;
import X.C43081xl;
import X.C46472Ap;
import X.C46532Ax;
import X.C46772Ev;
import X.C47032Ge;
import X.C47042Gf;
import X.C47882Kb;
import X.C47902Kd;
import X.C48522Mp;
import X.C48672Ng;
import X.C51122Xl;
import X.C51132Xm;
import X.C52102aa;
import X.C52312av;
import X.C52982cD;
import X.C53042cJ;
import X.C53482dL;
import X.C58772mV;
import X.C58872mg;
import X.C58882mh;
import X.C58892mi;
import X.C58902mj;
import X.C58912mk;
import X.C59362nW;
import X.C59382nY;
import X.C60462pT;
import X.C64462yE;
import X.C75133cQ;
import X.SurfaceHolder$CallbackC50852Wi;
import X.View$OnLongClickListenerC46662Ei;
import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.MentionableEntry;
import com.whatsapp.WaEditText;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.conversationrow.DeviceChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.crop.CropImageView;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RunnableEBaseShape7S0200000_I1_2 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape7S0200000_I1_2() {
        this.A02 = 25;
        this.A00 = new C02270Bi();
    }

    public RunnableEBaseShape7S0200000_I1_2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void run() {
        ImageView imageView;
        AnonymousClass2FF r0;
        AnonymousClass0QZ r4;
        long j;
        View view;
        AnonymousClass0ZA r02;
        AnonymousClass0M5 r11;
        int max;
        switch (this.A02) {
            case 0:
                AnonymousClass1T0 r1 = (AnonymousClass1T0) this.A01;
                AnonymousClass05l r03 = ((C28071St) this.A00).A00;
                if (r03 != null) {
                    r1.AEV(r03);
                    return;
                }
                Log.e("Layout is null after parsing");
                r1.AFc("Layout is null after parsing");
                return;
            case 1:
                C46532Ax r42 = (C46532Ax) this.A00;
                AnonymousClass05q r3 = (AnonymousClass05q) this.A01;
                AbstractC009505y r2 = r42.A00;
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() == 0) {
                    arrayList.add(C008805h.A0T(r42));
                    C008805h.A0P(r2, new C010106g(arrayList), r3);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            case 2:
                C43081xl r32 = (C43081xl) this.A00;
                C46472Ap r22 = (C46472Ap) this.A01;
                r32.A0F = true;
                try {
                    r32.A05.stop();
                } catch (RuntimeException e) {
                    Log.w("WaBloksCameraViewBinder/stop-video-capture ", e);
                }
                r32.A01();
                Camera camera = r32.A04;
                if (camera != null) {
                    camera.lock();
                }
                r32.A0E = false;
                r32.A02(r32.A06, r22);
                return;
            case 3:
                ((AnonymousClass05r) this.A00).A01.A05.A03((View) this.A01);
                return;
            case 4:
                ((AbstractC28161Td) this.A00).AGB((C28131Ta) this.A01);
                return;
            case 5:
                AnonymousClass2E4 r43 = (AnonymousClass2E4) this.A01;
                AnonymousClass0YW r5 = ((AnonymousClass2WY) this.A00).A01;
                r5.A0E.setEnabled(true);
                if (r5.A0e && (imageView = r5.A0E) != null) {
                    imageView.sendAccessibilityEvent(8);
                }
                r5.A0C.setEnabled(true);
                View view2 = r5.A0C;
                int i = 0;
                if (r5.A0N.getNumberOfCameras() <= 1) {
                    i = 8;
                }
                view2.setVisibility(i);
                r5.A0D.setEnabled(true);
                r5.A0A();
                r5.A0F.setVisibility(0);
                r5.A0m = true;
                if (r5.A06.getVisibility() == 0) {
                    r5.A06.setVisibility(8);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(400);
                    r5.A06.startAnimation(alphaAnimation);
                }
                r43.A00 = 1.0f;
                return;
            case 6:
                SurfaceHolder$CallbackC50852Wi r44 = (SurfaceHolder$CallbackC50852Wi) this.A00;
                SurfaceHolder surfaceHolder = (SurfaceHolder) this.A01;
                synchronized (r44) {
                    if (r44.A07 != null) {
                        try {
                            if (!surfaceHolder.isCreating()) {
                                Log.d("cameraview/restart-preview: !holder.isCreating");
                                r44.A07.stopPreview();
                                r44.A0L = false;
                            }
                            r44.A07.setPreviewDisplay(surfaceHolder);
                            r44.A06();
                        } catch (RuntimeException e2) {
                            r44.A07.release();
                            r44.A07 = null;
                            Log.e("cameraview/restart-preview ", e2);
                            r44.A08(1);
                        } catch (IOException e3) {
                            r44.A07.release();
                            r44.A07 = null;
                            Log.e("cameraview/restart-preview: error setting preview display", e3);
                            r44.A08(1);
                        }
                        return;
                    }
                    return;
                }
            case 7:
                ((AnonymousClass2Wh) this.A00).A0T((AnonymousClass2WW) this.A01);
                return;
            case 8:
                AnonymousClass2X5 r33 = (AnonymousClass2X5) this.A00;
                ArrayList arrayList2 = (ArrayList) this.A01;
                ChatInfoActivity chatInfoActivity = (ChatInfoActivity) r33.A09.get();
                if (!(chatInfoActivity == null || ((AnonymousClass0JW) r33).A00.isCancelled())) {
                    chatInfoActivity.A0f(arrayList2);
                    return;
                }
                return;
            case 9:
                C58772mV r34 = (C58772mV) this.A00;
                List list = (List) this.A01;
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) r34.A09.get();
                if (!(contactInfoActivity == null || ((AnonymousClass0JW) r34).A00.isCancelled())) {
                    contactInfoActivity.A0p(list);
                    return;
                }
                return;
            case 10:
                C58772mV r12 = (C58772mV) this.A00;
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                ContactInfoActivity contactInfoActivity2 = (ContactInfoActivity) r12.A09.get();
                if (!(contactInfoActivity2 == null || ((AnonymousClass0JW) r12).A00.isCancelled())) {
                    View findViewById = contactInfoActivity2.A02.findViewById(R.id.other_phones_view);
                    ViewGroup viewGroup = (ViewGroup) contactInfoActivity2.A02.findViewById(R.id.other_phones_container);
                    viewGroup.removeAllViews();
                    if (!abstractCollection.isEmpty()) {
                        findViewById.setVisibility(0);
                        Iterator it = abstractCollection.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            C46772Ev r8 = (C46772Ev) it.next();
                            View inflate = contactInfoActivity2.getLayoutInflater().inflate(R.layout.contact_info_phone, (ViewGroup) null, false);
                            viewGroup.addView(inflate, -1, -2);
                            View findViewById2 = inflate.findViewById(R.id.divider);
                            if (i2 == abstractCollection.size() - 1) {
                                findViewById2.setVisibility(8);
                            } else {
                                findViewById2.setVisibility(0);
                            }
                            View A0D = AnonymousClass0Q7.A0D(inflate, R.id.primary_action_btn);
                            View A0D2 = AnonymousClass0Q7.A0D(inflate, R.id.primary_action_icon);
                            if (r8.A01 == null) {
                                A0D.setVisibility(4);
                                A0D2.setVisibility(4);
                            } else {
                                ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1 = new ViewOnClickCListenerShape4S0200000_I1(contactInfoActivity2, r8, 15);
                                A0D2.setVisibility(0);
                                A0D2.setOnClickListener(viewOnClickCListenerShape4S0200000_I1);
                                A0D.setVisibility(0);
                                A0D.setOnClickListener(viewOnClickCListenerShape4S0200000_I1);
                                A0D.setOnLongClickListener(new View$OnLongClickListenerC46662Ei(contactInfoActivity2, r8));
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.title_tv);
                            AnonymousClass0SE.A03(textView);
                            textView.setText(r8.A02);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle_tv);
                            String str = r8.A03;
                            textView2.setText(str);
                            boolean isEmpty = TextUtils.isEmpty(str);
                            int i3 = 0;
                            if (isEmpty) {
                                i3 = 8;
                            }
                            textView2.setVisibility(i3);
                            inflate.findViewById(R.id.secondary_action_btn).setOnTouchListener(new AnonymousClass2PR(0.15f, 0.15f, 0.15f, 0.15f));
                            inflate.findViewById(R.id.secondary_action_btn).setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(contactInfoActivity2, r8, 19));
                            View findViewById3 = inflate.findViewById(R.id.third_action_btn);
                            if (r8.A00 == null || contactInfoActivity2.A0p.A02((UserJid) contactInfoActivity2.A0G.A02(UserJid.class))) {
                                findViewById3.setVisibility(8);
                            } else {
                                findViewById3.setVisibility(0);
                                findViewById3.setOnTouchListener(new AnonymousClass2PR(0.15f, 0.15f, 0.15f, 0.15f));
                                findViewById3.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(contactInfoActivity2, 34));
                            }
                            i2++;
                        }
                    } else {
                        findViewById.setVisibility(8);
                    }
                    contactInfoActivity2.A0C.A04(contactInfoActivity2.A04, contactInfoActivity2.A02, contactInfoActivity2.A08, contactInfoActivity2.A0D);
                    return;
                }
                return;
            case 11:
                C58772mV r35 = (C58772mV) this.A00;
                Bitmap bitmap = (Bitmap) this.A01;
                ContactInfoActivity contactInfoActivity3 = (ContactInfoActivity) r35.A09.get();
                if (!(contactInfoActivity3 == null || ((AnonymousClass0JW) r35).A00.isCancelled())) {
                    ContactInfoActivity.A06(contactInfoActivity3, bitmap);
                    return;
                }
                return;
            case 12:
                AnonymousClass2XS r13 = (AnonymousClass2XS) this.A00;
                AnonymousClass1VI r52 = (AnonymousClass1VI) this.A01;
                if (r52 == null || (r0 = r13.A00) == null || (r4 = r0.A00) == null) {
                    AnonymousClass2XR r14 = r13.A05.A00;
                    r14.A00 = null;
                    r14.A0D.A04(500);
                    return;
                }
                AnonymousClass2XP r7 = r13.A05;
                C75133cQ r04 = r13.A01;
                if (r04 != null) {
                    j = r04.A04;
                } else {
                    j = -1;
                }
                StringBuilder A0S = AnonymousClass008.A0S("companion-device-qr-handler/on-success: ");
                A0S.append(r52.A05);
                Log.d(A0S.toString());
                AnonymousClass2XR r6 = r7.A00;
                r6.A00 = new AnonymousClass2F8(r52, r4);
                r6.A0D.A02();
                if (j > 0) {
                    AnonymousClass008.A0l(r6.A08, "adv_timestamp_sec", j);
                }
                r6.A0E.ANF(new RunnableEBaseShape8S0100000_I1_3(r7, 26));
                return;
            case 13:
                C51132Xm r36 = (C51132Xm) this.A00;
                AnonymousClass0RN r23 = (AnonymousClass0RN) this.A01;
                Log.d("OptInWebBeta/Logging_Out_All_Devices");
                if (r23 != null) {
                    C02430Bz r15 = r36.A0B;
                    r15.A00(new C51122Xl(r23, r15));
                }
                r36.A0D.A0I(true);
                r36.A0F.A07();
                r36.A0C.A00();
                r36.A0B.A04();
                return;
            case 14:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                C12310ht r72 = (C12310ht) this.A01;
                r72.A02 = PhoneContactsSelector.A04(phoneContactsSelector.A0M, ((ActivityC004702f) phoneContactsSelector).A0G, phoneContactsSelector.A0K, ((AnonymousClass2C0) phoneContactsSelector).A01, phoneContactsSelector.A0G, phoneContactsSelector.A0I, r72);
                return;
            case 15:
                C58912mk r45 = (C58912mk) this.A00;
                List<C47032Ge> list2 = (List) this.A01;
                for (C47032Ge r62 : list2) {
                    AbstractC11910hD r05 = r62.A05;
                    View view3 = null;
                    View view4 = r05 == null ? null : r05.A0H;
                    AbstractC11910hD r06 = r62.A04;
                    if (r06 != null) {
                        view3 = r06.A0H;
                    }
                    if (view4 != null) {
                        C06330Su A0E = AnonymousClass0Q7.A0E(view4);
                        A0E.A04(((AbstractC16370ph) r45).A01);
                        r45.A02.add(r62.A05);
                        float f = (float) (r62.A02 - r62.A00);
                        View view5 = (View) A0E.A01.get();
                        if (view5 != null) {
                            view5.animate().translationX(f);
                        }
                        A0E.A03((float) (r62.A03 - r62.A01));
                        A0E.A02(0.0f);
                        C58892mi r16 = new C58892mi(r45, r62, A0E);
                        View view6 = (View) A0E.A01.get();
                        if (view6 != null) {
                            A0E.A05(view6, r16);
                        }
                        A0E.A01();
                    }
                    if (view3 != null) {
                        C06330Su A0E2 = AnonymousClass0Q7.A0E(view3);
                        r45.A02.add(r62.A04);
                        View view7 = (View) A0E2.A01.get();
                        if (view7 != null) {
                            view7.animate().translationX(0.0f);
                        }
                        A0E2.A03(0.0f);
                        A0E2.A04(((AbstractC16370ph) r45).A01);
                        A0E2.A02(1.0f);
                        C58902mj r17 = new C58902mj(r45, r62, A0E2, view3);
                        View view8 = (View) A0E2.A01.get();
                        if (view8 != null) {
                            A0E2.A05(view8, r17);
                        }
                        A0E2.A01();
                    }
                }
                list2.clear();
                r45.A03.remove(list2);
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                C58912mk r46 = (C58912mk) this.A00;
                List<AbstractC11910hD> list3 = (List) this.A01;
                for (AbstractC11910hD r53 : list3) {
                    C06330Su A0E3 = AnonymousClass0Q7.A0E(r53.A0H);
                    r46.A00.add(r53);
                    View view9 = (View) A0E3.A01.get();
                    if (view9 != null) {
                        view9.animate().scaleX(1.0f);
                    }
                    View view10 = (View) A0E3.A01.get();
                    if (view10 != null) {
                        view10.animate().scaleY(1.0f);
                    }
                    A0E3.A04(((AbstractC16370ph) r46).A00);
                    C58872mg r18 = new C58872mg(r46, r53, A0E3);
                    View view11 = (View) A0E3.A01.get();
                    if (view11 != null) {
                        A0E3.A05(view11, r18);
                    }
                    A0E3.A01();
                }
                list3.clear();
                r46.A01.remove(list3);
                return;
            case 17:
                C58912mk r63 = (C58912mk) this.A00;
                List<C47042Gf> list4 = (List) this.A01;
                for (C47042Gf r37 : list4) {
                    AbstractC11910hD r73 = r37.A04;
                    int i4 = r37.A00;
                    int i5 = r37.A01;
                    int i6 = r37.A02;
                    int i7 = r37.A03;
                    View view12 = r73.A0H;
                    int i8 = i6 - i4;
                    int i9 = i7 - i5;
                    if (!(i8 == 0 || (view = (View) AnonymousClass0Q7.A0E(view12).A01.get()) == null)) {
                        view.animate().translationX(0.0f);
                    }
                    if (i9 != 0) {
                        AnonymousClass0Q7.A0E(view12).A03(0.0f);
                    }
                    C06330Su A0E4 = AnonymousClass0Q7.A0E(view12);
                    r63.A04.add(r73);
                    A0E4.A04(((AbstractC16370ph) r63).A02);
                    C58882mh r54 = new C58882mh(r63, r73, i8, i9, A0E4);
                    View view13 = (View) A0E4.A01.get();
                    if (view13 != null) {
                        A0E4.A05(view13, r54);
                    }
                    A0E4.A01();
                }
                list4.clear();
                r63.A05.remove(list4);
                return;
            case 18:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                C48672Ng r24 = (C48672Ng) this.A01;
                sharedTextPreviewDialogFragment.A0A().getWindow().setSoftInputMode(1);
                if (r24.A01()) {
                    ((InputMethodManager) sharedTextPreviewDialogFragment.A0A().getSystemService("input_method")).hideSoftInputFromWindow(sharedTextPreviewDialogFragment.A02.getWindowToken(), 0);
                    r24.A00(true);
                }
                int selectionStart = sharedTextPreviewDialogFragment.A02.getSelectionStart();
                int selectionEnd = sharedTextPreviewDialogFragment.A02.getSelectionEnd();
                MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A02;
                mentionableEntry.setText(mentionableEntry.getStringText());
                sharedTextPreviewDialogFragment.A02.setSelection(selectionStart, selectionEnd);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                sharedTextPreviewDialogFragment.A02.getLocationOnScreen(iArr);
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A05.getLocationOnScreen(iArr2);
                MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A02;
                int i10 = iArr[0];
                ((WaEditText) mentionableEntry2).A00 = new Rect(i10, iArr[1], mentionableEntry2.getWidth() + i10, iArr2[1]);
                return;
            case 19:
                AnonymousClass0M3 r47 = (AnonymousClass0M3) this.A01;
                C04360Kb r38 = ((C60462pT) this.A00).A04;
                if (r38 != null) {
                    AnonymousClass00E.A07(AnonymousClass0FI.A0H(r47.A0m));
                    ((AnonymousClass0MM) r47).APJ(1);
                    r38.A1A.ANF(new RunnableEBaseShape6S0200000_I1_1(r38, r47, 13));
                    return;
                }
                throw null;
            case AnonymousClass0PW.A01:
                DeviceChangeDialogFragment deviceChangeDialogFragment = (DeviceChangeDialogFragment) this.A00;
                UserJid userJid = (UserJid) this.A01;
                if (userJid != null) {
                    deviceChangeDialogFragment.A00.A02(userJid);
                    return;
                }
                return;
            case 21:
                IdentityChangeDialogFragment identityChangeDialogFragment = (IdentityChangeDialogFragment) this.A00;
                int size = identityChangeDialogFragment.A00.A06((UserJid) ((C007003k) this.A01).A02(UserJid.class)).size();
                C015808q r19 = identityChangeDialogFragment.A01;
                boolean z = true;
                if (!r19.A01() && (!r19.A03() || size <= 1)) {
                    z = false;
                }
                ActivityC004902h A0A = identityChangeDialogFragment.A0A();
                if (!(A0A == null || A0A.isFinishing())) {
                    identityChangeDialogFragment.A0A().runOnUiThread(new RunnableEBaseShape1S0110000_I1(identityChangeDialogFragment, z, 8));
                    return;
                }
                return;
            case 22:
                AbstractC51922aG r39 = (AbstractC51922aG) this.A00;
                Map map = (Map) this.A01;
                AnonymousClass0DH r74 = r39.A0N;
                Set A0A2 = r74.A0A(map.values(), false);
                if (!r39.A0T.A06(map.values(), true)) {
                    r39.A0H.A0D(r39.A0R.A08(R.plurals.unstar_while_clearing_error, (long) map.values().size()), 0);
                    r74.A0I(A0A2);
                    return;
                }
                r74.A0J(A0A2);
                return;
            case 23:
                AbstractC51922aG r25 = (AbstractC51922aG) this.A00;
                Map map2 = (Map) this.A01;
                AnonymousClass0DH r55 = r25.A0N;
                Set A0A3 = r55.A0A(map2.values(), true);
                C04360Kb r26 = r25.A0M;
                Collection values = map2.values();
                r26.A0f.A04(values, true, true);
                r26.A0Q(values, true);
                r55.A0J(A0A3);
                return;
            case 24:
                AbstractC007503q r310 = (AbstractC007503q) this.A01;
                ListView A0T = ((ActivityC03630Ha) this.A00).A0T();
                C007303n r27 = r310.A0n;
                View findViewWithTag = A0T.findViewWithTag(r27);
                if (findViewWithTag instanceof AbstractC51572Zg) {
                    AbstractC51572Zg r110 = (AbstractC51572Zg) findViewWithTag;
                    if (r110.A0h(r27)) {
                        r110.A0Z(r310, true);
                        return;
                    }
                    throw new IllegalStateException();
                }
                return;
            case 25:
                synchronized (this) {
                    r02 = (AnonymousClass0ZA) this.A01;
                }
                if (r02 == null) {
                    ((C02270Bi) this.A00).A08(null);
                    return;
                }
                C05440On A0B = r02.A0B();
                if (A0B == null) {
                    ((C02270Bi) this.A00).A08(null);
                    return;
                }
                byte[] A08 = A0B.A08();
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(A08, 0, A08.length);
                if (decodeByteArray == null || decodeByteArray.getHeight() == 0 || decodeByteArray.getWidth() == 0) {
                    ((C02270Bi) this.A00).A08(null);
                    return;
                } else {
                    ((C02270Bi) this.A00).A08(decodeByteArray);
                    return;
                }
            case 26:
                ((C59362nW) this.A00).A01.A07(this.A01);
                return;
            case 27:
                C59362nW r311 = (C59362nW) this.A00;
                C64462yE r75 = (C64462yE) this.A01;
                AnonymousClass3L9 r122 = new AnonymousClass3L9(r311.A03, r311.A0G, new C52102aa(r311));
                AnonymousClass09H r82 = r122.A02;
                String A022 = r82.A02();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
                arrayList4.add(new AnonymousClass0OS("type", "get", null, (byte) 0));
                arrayList4.add(new AnonymousClass0OS("to", AnonymousClass0QU.A00));
                arrayList4.add(new AnonymousClass0OS("smax_id", "4", null, (byte) 0));
                arrayList4.add(new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0));
                arrayList3.add(new AnonymousClass0M5("account_number", (AnonymousClass0OS[]) null, r75.A01));
                arrayList3.add(new AnonymousClass0M5("code", (AnonymousClass0OS[]) null, r75.A00));
                arrayList3.add(new AnonymousClass0M5("expected_source_url", (AnonymousClass0OS[]) null, r75.A02));
                AnonymousClass0OS[] r28 = !arrayList4.isEmpty() ? (AnonymousClass0OS[]) arrayList4.toArray(new AnonymousClass0OS[0]) : null;
                AnonymousClass0M5[] r111 = !arrayList3.isEmpty() ? (AnonymousClass0M5[]) arrayList3.toArray(new AnonymousClass0M5[0]) : null;
                if (r111 == null) {
                    r11 = new AnonymousClass0M5("iq", r28, null, null);
                } else {
                    r11 = new AnonymousClass0M5("iq", r28, r111, null);
                }
                r82.A0B(246, A022, r11, r122, 0);
                return;
            case 28:
                C52312av r48 = (C52312av) this.A00;
                Iterator it2 = ((AbstractCollection) this.A01).iterator();
                while (it2.hasNext()) {
                    AnonymousClass02N r29 = (AnonymousClass02N) it2.next();
                    if (!AnonymousClass1VY.A0d(r29)) {
                        r48.A0F.A0j.A0H(r29, true);
                    }
                }
                return;
            case 29:
                C52312av r312 = (C52312av) this.A00;
                AbstractCollection abstractCollection2 = (AbstractCollection) this.A01;
                int size2 = abstractCollection2.size();
                Iterator it3 = abstractCollection2.iterator();
                while (it3.hasNext()) {
                    r312.A0F.A0L.A01((AnonymousClass02N) it3.next());
                }
                ConversationsFragment conversationsFragment = r312.A0F;
                conversationsFragment.A0d.A0D(conversationsFragment.A19.A08(R.plurals.unpin_toast, (long) size2), 0);
                return;
            case 30:
                C52312av r49 = (C52312av) this.A00;
                AbstractCollection abstractCollection3 = (AbstractCollection) this.A01;
                if (!abstractCollection3.isEmpty()) {
                    Iterator it4 = abstractCollection3.iterator();
                    while (it4.hasNext()) {
                        AnonymousClass02N r76 = (AnonymousClass02N) it4.next();
                        ConversationsFragment conversationsFragment2 = r49.A0F;
                        conversationsFragment2.A1A.A03(r76, false);
                        conversationsFragment2.A1b.A01(4, r76, 0, 0);
                    }
                    return;
                }
                return;
            case 31:
                ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment = (ConversationsFragment.BulkLeaveGroupsDialogFragment) this.A00;
                SystemClock.sleep(300);
                bulkLeaveGroupsDialogFragment.A09.A08(new AnonymousClass21U(bulkLeaveGroupsDialogFragment.A0C, bulkLeaveGroupsDialogFragment.A08, bulkLeaveGroupsDialogFragment.A06, (AnonymousClass02U) this.A01, null, null, 16, null));
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH:
                C59382nY r112 = (C59382nY) this.A00;
                if (!((Activity) this.A01).isFinishing()) {
                    ConversationsFragment conversationsFragment3 = r112.A04;
                    conversationsFragment3.A06.removeHeaderView(conversationsFragment3.A03);
                    conversationsFragment3.A03 = null;
                    return;
                }
                return;
            case 33:
                C59382nY r113 = (C59382nY) this.A00;
                if (!((Activity) this.A01).isFinishing()) {
                    ConversationsFragment conversationsFragment4 = r113.A04;
                    conversationsFragment4.A06.removeHeaderView(conversationsFragment4.A03);
                    conversationsFragment4.A03 = null;
                    return;
                }
                return;
            case 34:
                ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment = (ConversationsFragment.ExitGroupDialogFragment) this.A00;
                SystemClock.sleep(300);
                AnonymousClass0AR r114 = exitGroupDialogFragment.A0B;
                AnonymousClass0C4 r410 = exitGroupDialogFragment.A0E;
                AnonymousClass0EO r56 = exitGroupDialogFragment.A0A;
                AnonymousClass0A8 r64 = exitGroupDialogFragment.A08;
                Jid A023 = ((C007003k) this.A01).A02(AnonymousClass02U.class);
                if (A023 != null) {
                    r114.A08(new AnonymousClass21U(r410, r56, r64, (AnonymousClass02U) A023, null, null, 16, null));
                    return;
                }
                throw null;
            case 35:
                ((CropImageView) this.A00).A05((AnonymousClass2K7) this.A01);
                return;
            case 36:
                AnonymousClass0FS r411 = (AnonymousClass0FS) this.A00;
                r411.A0B.A02.post(new RunnableEBaseShape2S0200000_I0_1(r411, this.A01, 15));
                return;
            case 37:
                AnonymousClass0FS r412 = (AnonymousClass0FS) this.A00;
                r412.A0B.A02.post(new RunnableEBaseShape2S0200000_I0_1(r412, this.A01, 14));
                return;
            case 38:
                ConversationDeleteService conversationDeleteService = (ConversationDeleteService) this.A00;
                AnonymousClass02N r115 = (AnonymousClass02N) this.A01;
                C47882Kb r313 = (C47882Kb) conversationDeleteService.A0A.get(r115);
                int A012 = conversationDeleteService.A06.A01(r115);
                synchronized (r313) {
                    int i11 = r313.A01;
                    max = Math.max(0, A012 - i11);
                    r313.A01 = i11 + max;
                }
                conversationDeleteService.A0D.addAndGet(max);
                return;
            case 39:
                ((Service) this.A00).startForeground(13, ((AnonymousClass03E) this.A01).A01());
                return;
            case 40:
                ((C02320Bn) this.A00).A03(new C47902Kd((AnonymousClass1XJ) this.A01));
                return;
            case 41:
                ((C41191ud) this.A01).A00(((AnonymousClass1V4) this.A00).A01.A0A());
                return;
            case 42:
                C016909b r413 = (C016909b) this.A00;
                C08560bL r314 = (C08560bL) this.A01;
                try {
                    C014408c r210 = r413.A06;
                    if (!r210.A0G()) {
                        r210.A02(r314.A0C(), r314.A0T);
                        return;
                    }
                    ContentValues A0C = r314.A0C();
                    AnonymousClass02N r116 = r314.A0T;
                    if (r210.A01(A0C, r116) > 0) {
                        r210.A02(r314.A0C(), r116);
                        return;
                    }
                    return;
                } catch (SQLiteDatabaseCorruptException e4) {
                    Log.e(e4);
                    r413.A09.A02();
                    return;
                } catch (Error | RuntimeException e5) {
                    Log.e(e5);
                    throw e5;
                }
            case 43:
                C52982cD r315 = (C52982cD) this.A00;
                C29241Xq r211 = ((AnonymousClass2cX) ((AbstractC48432Mf) this.A01)).A01;
                String str2 = r211.A0A;
                if (str2 == null) {
                    throw null;
                } else if (r211.A01()) {
                    r315.A04.A05(r211);
                    return;
                } else {
                    r315.A01.A02(str2);
                    return;
                }
            case 44:
                AnonymousClass0B3 r117 = ((C52982cD) this.A00).A01;
                String str3 = ((AnonymousClass2cX) ((AbstractC48432Mf) this.A01)).A01.A0A;
                if (str3 != null) {
                    r117.A08(str3);
                    return;
                }
                throw null;
            case 45:
                C53042cJ r118 = (C53042cJ) this.A00;
                CharSequence charSequence = (CharSequence) this.A01;
                r118.A00 = null;
                String charSequence2 = charSequence.toString();
                C48522Mp r119 = r118.A01;
                if (!charSequence2.equals(r119.A0B) && r119.A0K.getVisibility() == 0) {
                    r119.A06(charSequence.toString());
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                ((View) this.A00).setLayoutParams((ViewGroup.LayoutParams) this.A01);
                return;
            case 47:
                ((C48522Mp) this.A00).A0I.setLayoutParams((ViewGroup.LayoutParams) this.A01);
                return;
            case 48:
                C48672Ng r212 = (C48672Ng) this.A01;
                ((Dialog) this.A00).getWindow().setSoftInputMode(1);
                if (r212.A01()) {
                    r212.A00(true);
                    return;
                }
                return;
            case 49:
                C53482dL r120 = (C53482dL) this.A00;
                CharSequence charSequence3 = (CharSequence) this.A01;
                r120.A00 = null;
                String charSequence4 = charSequence3.toString();
                EmojiSearchContainer emojiSearchContainer = r120.A02;
                if (!charSequence4.equals(emojiSearchContainer.A0C) && emojiSearchContainer.getVisibility() == 0) {
                    emojiSearchContainer.A00(charSequence3.toString());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
