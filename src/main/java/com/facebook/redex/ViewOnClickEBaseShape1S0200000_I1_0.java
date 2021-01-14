package com.facebook.redex;

import X.AbstractActivityC60812rK;
import X.AbstractC004502c;
import X.AbstractC007503q;
import X.AbstractC009505y;
import X.AbstractC11910hD;
import X.AbstractC16300pa;
import X.AbstractC16520pw;
import X.AbstractC24951Dr;
import X.AbstractC43421yL;
import X.AbstractC51572Zg;
import X.AbstractC59162nB;
import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03S;
import X.AnonymousClass05q;
import X.AnonymousClass0GG;
import X.AnonymousClass0GZ;
import X.AnonymousClass0K4;
import X.AnonymousClass0LW;
import X.AnonymousClass0MB;
import X.AnonymousClass0MH;
import X.AnonymousClass0PW;
import X.AnonymousClass0QB;
import X.AnonymousClass0QC;
import X.AnonymousClass0QM;
import X.AnonymousClass0Z6;
import X.AnonymousClass0Z9;
import X.AnonymousClass0ZH;
import X.AnonymousClass1K5;
import X.AnonymousClass1K6;
import X.AnonymousClass1LT;
import X.AnonymousClass1RU;
import X.AnonymousClass1VI;
import X.AnonymousClass1VY;
import X.AnonymousClass1XR;
import X.AnonymousClass1Z3;
import X.AnonymousClass1Z4;
import X.AnonymousClass1t2;
import X.AnonymousClass21P;
import X.AnonymousClass2AY;
import X.AnonymousClass2CD;
import X.AnonymousClass2Cp;
import X.AnonymousClass2D8;
import X.AnonymousClass2JF;
import X.AnonymousClass2MO;
import X.AnonymousClass2MQ;
import X.AnonymousClass2ND;
import X.AnonymousClass2O9;
import X.AnonymousClass2OA;
import X.AnonymousClass2UT;
import X.AnonymousClass2XW;
import X.AnonymousClass2YM;
import X.AnonymousClass2YT;
import X.AnonymousClass2YX;
import X.AnonymousClass2Z9;
import X.AnonymousClass2ZC;
import X.AnonymousClass2ZT;
import X.AnonymousClass2ZU;
import X.C002001d;
import X.C005902w;
import X.C006803i;
import X.C007003k;
import X.C008805h;
import X.C010106g;
import X.C02900Dx;
import X.C09200cS;
import X.C12310ht;
import X.C26991Nn;
import X.C28741Vo;
import X.C40201sn;
import X.C40311sz;
import X.C40321t0;
import X.C40711ti;
import X.C40721tj;
import X.C40731tk;
import X.C40801tr;
import X.C40941uA;
import X.C41741vZ;
import X.C46522Au;
import X.C46772Ev;
import X.C49482Qq;
import X.C49552Qx;
import X.C52062aW;
import X.C52252ap;
import X.C53322ct;
import X.C53882dz;
import X.C59192nE;
import X.C59212nG;
import X.C59222nH;
import X.C60122oq;
import X.C60132or;
import X.C60352pI;
import X.C60402pN;
import X.C72403Ss;
import X.ViewTreeObserver$OnPreDrawListenerC27011Np;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.MentionableEntry;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.StatusesFragment;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.ProductGalleryFragment;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.inappsupport.ui.SupportTopicsFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.List;

public class ViewOnClickEBaseShape1S0200000_I1_0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape1S0200000_I1_0(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        int i;
        AnonymousClass2JF r0;
        AnonymousClass1XR r5;
        C72403Ss r02;
        int length;
        switch (this.A02) {
            case 0:
                try {
                    ((Context) this.A00).startActivity((Intent) this.A01);
                    return;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case 1:
                ((View.OnClickListener) this.A01).onClick(view);
                ((AbstractC24951Dr) this.A00).A02(1);
                return;
            case 2:
                AnonymousClass2AY r1 = (AnonymousClass2AY) this.A00;
                AbstractC009505y r3 = r1.A07;
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() == 0) {
                    arrayList.add(C008805h.A0T(r1));
                    C008805h.A0P(r3, new C010106g(arrayList), (AnonymousClass05q) this.A01);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            case 3:
                ((AnonymousClass1LT) this.A00).A00.AE3(((CompoundButton) this.A01).isChecked());
                return;
            case 4:
                Activity activity = (Activity) this.A01;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(((AnonymousClass0GZ) this.A00).A01());
                activity.startActivity(intent);
                activity.finish();
                return;
            case 5:
                C005902w r4 = (C005902w) this.A01;
                IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = ((C40201sn) this.A00).A02;
                if (intentChooserBottomSheetDialogFragment.A02 == null) {
                    intentChooserBottomSheetDialogFragment.A0B().startActivityForResult(r4.A02, intentChooserBottomSheetDialogFragment.A00);
                } else {
                    AnonymousClass037 A06 = intentChooserBottomSheetDialogFragment.A0D().A06(intentChooserBottomSheetDialogFragment.A02.intValue());
                    if (A06 != null) {
                        A06.startActivityForResult(r4.A02, intentChooserBottomSheetDialogFragment.A00);
                    } else {
                        throw null;
                    }
                }
                intentChooserBottomSheetDialogFragment.A0w(false, false);
                return;
            case 6:
                C007003k r12 = (C007003k) this.A01;
                MentionableEntry mentionableEntry = (MentionableEntry) ((AnonymousClass1t2) this.A00).A0C;
                Editable text = mentionableEntry.getText();
                if (r12 != null) {
                    mentionableEntry.A0D(true);
                    AnonymousClass0Z6 r03 = mentionableEntry.A0E;
                    if (r03 != null) {
                        String A022 = r03.A02(r12);
                        int min = Math.min(mentionableEntry.A04(text, 0), mentionableEntry.getSelectionStart());
                        if (min < 0) {
                            min = mentionableEntry.getSelectionStart();
                        }
                        int i2 = min + 1;
                        String A0K = AnonymousClass008.A0K("@", A022);
                        mentionableEntry.A0A(mentionableEntry.A08);
                        mentionableEntry.A08 = null;
                        int selectionEnd = mentionableEntry.getSelectionEnd();
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0K);
                        sb.append(" ");
                        text.replace(min, selectionEnd, sb.toString());
                        C40311sz r42 = new C40311sz(mentionableEntry.A00, true);
                        text.setSpan(r42, min, i2, 33);
                        int i3 = mentionableEntry.A01;
                        Jid A023 = r12.A02(UserJid.class);
                        if (A023 != null) {
                            C40321t0 r13 = new C40321t0(i3, C006803i.A0H((UserJid) A023), r42);
                            text.setSpan(r13, i2, A022.length() + i2, 33);
                            mentionableEntry.setSelection(0);
                            mentionableEntry.setSelection(text.getSpanEnd(r13) + 1);
                            mentionableEntry.A0C(null);
                            mentionableEntry.A0D(false);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            case 7:
                ((QuickContactActivity) this.A00).A0W((Intent) this.A01);
                return;
            case 8:
                Context context = (Context) this.A00;
                C40731tk r2 = (C40731tk) this.A01;
                AnonymousClass008.A1U(AnonymousClass008.A0S("sharelinkactivity/sendlink/"), r2.A00);
                if (!TextUtils.isEmpty(r2.A00)) {
                    String str = r2.A00;
                    Intent intent2 = new Intent(context, ContactPicker.class);
                    intent2.putExtra("android.intent.extra.TEXT", str);
                    intent2.setType("text/plain");
                    intent2.addFlags(524288);
                    context.startActivity(intent2);
                    return;
                }
                return;
            case 9:
                AnonymousClass2Cp r43 = (AnonymousClass2Cp) this.A00;
                C40711ti r32 = (C40711ti) this.A01;
                ClipboardManager A05 = r43.A02.A05();
                if (A05 == null) {
                    ((ActivityC004702f) r43).A0F.A06(R.string.view_contact_unsupport, 0);
                    return;
                } else if (!TextUtils.isEmpty(r32.A00)) {
                    try {
                        String str2 = r32.A00;
                        A05.setPrimaryClip(ClipData.newPlainText(str2, str2));
                        ((ActivityC004702f) r43).A0F.A06(R.string.link_copied_confirmation, 0);
                        return;
                    } catch (NullPointerException e2) {
                        com.whatsapp.util.Log.e("sharelinkactivity/copylink/npe", e2);
                        ((ActivityC004702f) r43).A0F.A06(R.string.view_contact_unsupport, 0);
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                Context context2 = (Context) this.A00;
                C40721tj r44 = (C40721tj) this.A01;
                AnonymousClass008.A1U(AnonymousClass008.A0S("sharelinkactivity/sharelink/"), r44.A02);
                if (!TextUtils.isEmpty(r44.A02)) {
                    Intent intent3 = new Intent("android.intent.action.SEND");
                    intent3.putExtra("android.intent.extra.TEXT", r44.A02);
                    if (!TextUtils.isEmpty(r44.A01)) {
                        intent3.putExtra("android.intent.extra.SUBJECT", r44.A01);
                    }
                    intent3.setType("text/plain");
                    intent3.addFlags(524288);
                    context2.startActivity(Intent.createChooser(intent3, r44.A00));
                    return;
                }
                return;
            case 11:
                ImageView imageView = (ImageView) this.A01;
                StatusesFragment statusesFragment = ((C40801tr) this.A00).A01;
                if (statusesFragment.A00 == null) {
                    statusesFragment.A0H = !statusesFragment.A0H;
                    statusesFragment.A0w(imageView);
                    if (statusesFragment.A0H) {
                        statusesFragment.A0y(false, new C26991Nn(statusesFragment));
                        return;
                    }
                    statusesFragment.A0C.addAll(statusesFragment.A0D);
                    statusesFragment.A06.notifyDataSetChanged();
                    statusesFragment.A0n();
                    ((ListFragment) statusesFragment).A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27011Np(statusesFragment));
                    return;
                }
                return;
            case 12:
                C40941uA r33 = (C40941uA) this.A00;
                AnonymousClass1Z4 r6 = (AnonymousClass1Z4) this.A01;
                byte[] bArr = r6.A09;
                Bitmap decodeByteArray = (bArr == null || (length = bArr.length) <= 0) ? null : BitmapFactory.decodeByteArray(bArr, 0, length);
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = r33.A01;
                viewSharedContactArrayActivity.A05 = r6;
                List list = viewSharedContactArrayActivity.A0P;
                list.clear();
                ArrayList arrayList2 = viewSharedContactArrayActivity.A0O;
                arrayList2.clear();
                List<AnonymousClass1Z3> list2 = r6.A05;
                if (list2 != null) {
                    for (AnonymousClass1Z3 r14 : list2) {
                        arrayList2.add(r14.A02);
                        UserJid userJid = r14.A01;
                        if (userJid != null) {
                            list.add(userJid);
                        } else {
                            list.add(null);
                        }
                    }
                }
                r6.toString();
                AnonymousClass0MB r34 = new AnonymousClass0MB(viewSharedContactArrayActivity);
                AnonymousClass01X r22 = viewSharedContactArrayActivity.A0E;
                r34.A01.A0E = r22.A06(R.string.add_contact_as_new_or_existing);
                r34.A07(r22.A06(R.string.new_contact), new AnonymousClass1K5(viewSharedContactArrayActivity, r6, decodeByteArray));
                r34.A05(r22.A06(R.string.existing_contact), new AnonymousClass1K6(viewSharedContactArrayActivity, r6, decodeByteArray));
                r34.A00().show();
                return;
            case 13:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = ((C40941uA) this.A00).A01;
                viewSharedContactArrayActivity2.A0L.A01((C007003k) this.A01, viewSharedContactArrayActivity2, 15, true, true);
                return;
            case 14:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.A0g(27, null);
                restoreFromBackupActivity.A0b();
                restoreFromBackupActivity.A0j(true);
                return;
            case 15:
                C41741vZ r45 = (C41741vZ) this.A00;
                ActivityC004702f r35 = r45.A0B;
                Intent intent4 = new Intent(r35, BusinessProfileExtraFieldsActivity.class);
                Jid jid = ((C007003k) this.A01).A09;
                if (jid != null) {
                    intent4.putExtra("jid", jid.getRawString());
                    r35.startActivity(intent4);
                    AnonymousClass21P r36 = new AnonymousClass21P();
                    r36.A00 = 8;
                    r45.A0N.A0B(r36, null, false);
                    return;
                }
                throw null;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                AnonymousClass1RU r52 = (AnonymousClass1RU) this.A00;
                AnonymousClass21P r37 = new AnonymousClass21P();
                r37.A00 = 3;
                r52.A0D.A0B(r37, null, false);
                r52.A01.A05(r52.A02, (Intent) this.A01);
                return;
            case 17:
                C46522Au r46 = (C46522Au) this.A00;
                AnonymousClass05q r38 = (AnonymousClass05q) this.A01;
                AbstractC009505y r23 = r46.A00;
                ArrayList arrayList3 = new ArrayList();
                if (arrayList3.size() == 0) {
                    arrayList3.add(C008805h.A0T(r46));
                    C008805h.A0P(r23, new C010106g(arrayList3), r38);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            case 18:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
                ((View) this.A00).setVisibility(8);
                if (!videoSurfaceView.isPlaying()) {
                    videoSurfaceView.start();
                    return;
                }
                return;
            case 19:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                C46772Ev r24 = (C46772Ev) this.A01;
                C007003k r39 = r24.A00;
                if (r39 != null) {
                    contactInfoActivity.A13.A06(r39, contactInfoActivity, 6, true);
                    return;
                }
                StringBuilder A0S = AnonymousClass008.A0S("tel:");
                A0S.append(r24.A02);
                try {
                    contactInfoActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(A0S.toString())));
                    return;
                } catch (ActivityNotFoundException e3) {
                    com.whatsapp.util.Log.w("contact_info/dial dialer app not found", e3);
                    ((ActivityC004702f) contactInfoActivity).A0F.A06(R.string.view_contact_unsupport, 0);
                    return;
                }
            case AnonymousClass0PW.A01:
                LinkedDevicesActivity linkedDevicesActivity = ((AnonymousClass2XW) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = new LinkedDevicesDetailDialogFragment((C28741Vo) this.A01, ((AbstractActivityC60812rK) linkedDevicesActivity).A01);
                linkedDevicesActivity.A03 = linkedDevicesDetailDialogFragment;
                linkedDevicesDetailDialogFragment.A00 = linkedDevicesActivity;
                linkedDevicesDetailDialogFragment.A0u(linkedDevicesActivity.A04(), null);
                return;
            case 21:
                LinkedDevicesActivity linkedDevicesActivity2 = ((AnonymousClass2XW) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = new LinkedDevicesDetailDialogFragment((AnonymousClass1VI) this.A01, ((AbstractActivityC60812rK) linkedDevicesActivity2).A01);
                linkedDevicesActivity2.A03 = linkedDevicesDetailDialogFragment2;
                linkedDevicesDetailDialogFragment2.A00 = linkedDevicesActivity2;
                linkedDevicesDetailDialogFragment2.A0u(linkedDevicesActivity2.A04(), null);
                return;
            case 22:
                LinkedDevicesActivity linkedDevicesActivity3 = ((AnonymousClass2XW) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment3 = new LinkedDevicesDetailDialogFragment((AnonymousClass0K4) this.A01, ((AbstractActivityC60812rK) linkedDevicesActivity3).A01);
                linkedDevicesActivity3.A03 = linkedDevicesDetailDialogFragment3;
                linkedDevicesDetailDialogFragment3.A00 = linkedDevicesActivity3;
                linkedDevicesDetailDialogFragment3.A0u(linkedDevicesActivity3.A04(), null);
                return;
            case 23:
                Intent intent5 = new Intent();
                intent5.putExtra("call_type", 1);
                ((AnonymousClass2YM) this.A00).A03.A1F((C007003k) this.A01, intent5);
                return;
            case 24:
                ((AnonymousClass2YM) this.A00).A03.A15((C007003k) this.A01);
                return;
            case 25:
                Intent intent6 = new Intent();
                intent6.putExtra("call_type", 2);
                ((AnonymousClass2YM) this.A00).A03.A1F((C007003k) this.A01, intent6);
                return;
            case 26:
                AnonymousClass2YT r25 = (AnonymousClass2YT) this.A00;
                C007003k r15 = (C007003k) this.A01;
                if (r15.A0V) {
                    r25.A00.A0i(r15);
                    return;
                }
                return;
            case 27:
                AnonymousClass2YX r26 = (AnonymousClass2YX) this.A00;
                C12310ht r16 = (C12310ht) this.A01;
                if (r16.A03) {
                    r26.A00.A0Y(r16);
                    return;
                }
                return;
            case 28:
                AnonymousClass2ZC r53 = (AnonymousClass2ZC) this.A00;
                Activity activity2 = (Activity) this.A01;
                ContactInfoActivity.A07(r53.A0D, activity2, AnonymousClass2UT.A01(activity2, r53.A0G.findViewById(R.id.transition_start), r53.A0K.A01(R.string.transition_photo)));
                return;
            case 29:
                ((AnonymousClass2Z9) this.A00).AI8((MenuItem) this.A01);
                return;
            case 30:
                AnonymousClass2ZC r54 = (AnonymousClass2ZC) this.A00;
                Activity activity3 = (Activity) this.A01;
                GroupChatInfo.A05(r54.A0D, activity3, AnonymousClass2UT.A01(activity3, r54.A0G.findViewById(R.id.transition_start), r54.A0K.A01(R.string.transition_photo)));
                return;
            case 31:
                AnonymousClass2ZC r55 = (AnonymousClass2ZC) this.A00;
                Activity activity4 = (Activity) this.A01;
                ListChatInfo.A04(r55.A0D, activity4, AnonymousClass2UT.A01(activity4, r55.A0G.findViewById(R.id.transition_start), r55.A0K.A01(R.string.transition_photo)));
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                C60352pI r310 = (C60352pI) this.A00;
                AbstractC007503q r27 = (AbstractC007503q) this.A01;
                AnonymousClass03S r17 = ((AbstractC59162nB) r310).A02;
                if (r17 == null || RequestPermissionActivity.A0N(r310.getContext(), r17)) {
                    AbstractC43421yL rowsContainer = r310.getRowsContainer();
                    if (rowsContainer == null || ((r02 = r310.A03) != null && r02.A0B())) {
                        ((AbstractC59162nB) r310).A09.onClick(view);
                        return;
                    }
                    rowsContainer.A1w(r27.A0n);
                    r310.A0o();
                    return;
                }
                return;
            case 33:
                AbstractC51572Zg r47 = (AbstractC51572Zg) this.A00;
                AnonymousClass0ZH r311 = (AnonymousClass0ZH) this.A01;
                List A0v = r311.A0v();
                if (A0v.isEmpty()) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("call logs are empty, message.key=");
                    A0S2.append(r311.A0n);
                    com.whatsapp.util.Log.e(A0S2.toString());
                    return;
                }
                Object obj = A0v.get(0);
                AnonymousClass00E.A04(obj, "null call log");
                AnonymousClass0QM r28 = (AnonymousClass0QM) obj;
                Context A0O = C002001d.A0O(r47.getContext());
                if (!(A0O instanceof ActivityC004902h) || !r28.A0D()) {
                    C09200cS r56 = r47.A1G;
                    AnonymousClass01A r18 = r47.A0e;
                    AnonymousClass02N r04 = r311.A0n.A00;
                    if (r04 != null) {
                        r56.A01(r18.A0A(r04), A0O, 8, false, r311.A0y());
                        return;
                    }
                    throw null;
                }
                C002001d.A30(r28, r47.A0e, (ActivityC004902h) A0O, 8);
                return;
            case 34:
                AbstractC51572Zg r29 = (AbstractC51572Zg) this.A00;
                AbstractC007503q A09 = r29.A0p.A09((AnonymousClass0MH) this.A01);
                Context A0O2 = C002001d.A0O(r29.getContext());
                if (A09 != null && (A0O2 instanceof Conversation)) {
                    Conversation conversation = (Conversation) A0O2;
                    conversation.A1C(A09, conversation.getResources().getDimensionPixelSize(R.dimen.conversation_row_min_height));
                    return;
                }
                return;
            case 35:
                C59212nG r312 = (C59212nG) this.A00;
                AbstractC007503q r48 = (AbstractC007503q) this.A01;
                AnonymousClass0GG r19 = r312.A0B;
                AnonymousClass0MH r05 = r48.A0F;
                if (r05 == null) {
                    throw null;
                } else if (r19.A0H(UserJid.of(r05.A09))) {
                    ((AbstractC004502c) r312.getContext()).APm(UnblockDialogFragment.A00(r312.A0n.A0D(R.string.payment_unblock_ask, r312.A0f.A08(r312.A0e.A0A(r48.A0F.A09), false)), 0, false, new AnonymousClass2ZU(r312, r48)));
                    return;
                } else {
                    Intent A012 = r312.A0J.A01(r312.getContext(), true, false);
                    A012.putExtra("extra_payment_preset_amount", r312.A0L.A01().A4P(r312.A0n, r48.A0F.A06));
                    AnonymousClass02N r62 = r48.A0n.A00;
                    if (r62 instanceof GroupJid) {
                        A012.putExtra("extra_jid", r62.getRawString());
                        A012.putExtra("extra_receiver_jid", AnonymousClass1VY.A0D(r48.A0F.A09));
                    } else {
                        A012.putExtra("extra_jid", AnonymousClass1VY.A0D(r48.A0F.A09));
                    }
                    A012.putExtra("extra_payment_note", r48.A0D());
                    A012.putExtra("extra_conversation_message_type", 1);
                    if (r48.A0r()) {
                        List list3 = r48.A0c;
                        if (list3 != null) {
                            A012.putStringArrayListExtra("extra_mentioned_jids", new ArrayList<>(AnonymousClass1VY.A0F(list3)));
                        } else {
                            throw null;
                        }
                    }
                    r312.getContext().startActivity(A012);
                    return;
                }
            case 36:
                C60402pN r49 = (C60402pN) this.A00;
                Intent intent7 = new Intent(r49.getContext(), r49.A04.A03().A4f());
                intent7.putExtra("extra_setup_mode", 1);
                intent7.putExtra("extra_jid", AnonymousClass1VY.A0D(((AbstractC007503q) this.A01).A07()));
                r49.getContext().startActivity(intent7);
                return;
            case 37:
                C60402pN r410 = (C60402pN) this.A00;
                Intent intent8 = new Intent(r410.getContext(), r410.A04.A03().A8z());
                intent8.putExtra("extra_jid", AnonymousClass1VY.A0D(((AbstractC007503q) this.A01).A07()));
                r410.getContext().startActivity(intent8);
                return;
            case 38:
                C59222nH r8 = (C59222nH) this.A00;
                AnonymousClass0MH r210 = (AnonymousClass0MH) this.A01;
                Intent intent9 = new Intent(r8.getContext(), r8.A02.A03().A8K());
                AnonymousClass02N r63 = r210.A08;
                boolean z = r210.A0M;
                String str3 = r210.A0H;
                if (intent9.hasExtra("fMessageKeyJid") || intent9.hasExtra("fMessageKeyFromMe") || intent9.hasExtra("fMessageKeyId")) {
                    throw new IllegalArgumentException("Intent already contains key.");
                }
                intent9.putExtra("fMessageKeyId", str3).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", AnonymousClass1VY.A0D(r63));
                r8.getContext().startActivity(intent9);
                return;
            case 39:
                SelectListBottomSheet selectListBottomSheet = (SelectListBottomSheet) this.A00;
                C52062aW r411 = (C52062aW) this.A01;
                if (!(selectListBottomSheet.A00 == null || (i = r411.A00) == -1)) {
                    List list4 = r411.A02;
                    if (i <= list4.size() && list4.get(r411.A00) != null) {
                        AnonymousClass2ZT r313 = selectListBottomSheet.A00;
                        int i4 = r411.A00;
                        if (i4 != -1) {
                            List list5 = r411.A02;
                            if (i4 <= list5.size()) {
                                r0 = (AnonymousClass2JF) list5.get(r411.A00);
                                r5 = r0.A00;
                                C59192nE r211 = r313.A00;
                                Context A0O3 = C002001d.A0O(r211.getContext());
                                if (r5 != null || !(A0O3 instanceof Conversation)) {
                                    com.whatsapp.util.Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                                } else {
                                    ((AbstractC51572Zg) r211).A0V.A02.postDelayed(new RunnableEBaseShape2S0300000_I1(r211, A0O3, r5, 22), 400);
                                }
                            }
                        }
                        r0 = null;
                        r5 = r0.A00;
                        C59192nE r2112 = r313.A00;
                        Context A0O32 = C002001d.A0O(r2112.getContext());
                        if (r5 != null) {
                        }
                        com.whatsapp.util.Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                    }
                }
                selectListBottomSheet.A0w(false, false);
                return;
            case 40:
                ((C52252ap) this.A00).A03.AED((AnonymousClass2CD) this.A01);
                return;
            case 41:
                C52252ap r06 = (C52252ap) this.A00;
                r06.A03.AEA((AnonymousClass02N) this.A01, r06.A0C);
                return;
            case 42:
                AnonymousClass2MQ r212 = (AnonymousClass2MQ) this.A00;
                AnonymousClass2MO r110 = (AnonymousClass2MO) this.A01;
                r212.A0C = r212.A0A.getText().toString();
                r212.A00 = r110.A00;
                r212.A01 = r110.A01;
                r212.dismiss();
                return;
            case 43:
                C53322ct r412 = (C53322ct) this.A00;
                int A002 = ((AbstractC11910hD) this.A01).A00();
                if (A002 != -1) {
                    AnonymousClass2ND r111 = r412.A02;
                    r111.A02 = false;
                    r412.A09(A002);
                    ShapePickerRecyclerView shapePickerRecyclerView = r111.A08;
                    int intValue = ((Number) r412.A01.get(A002)).intValue();
                    GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A06;
                    if (gridLayoutManager != null) {
                        AbstractC16520pw r07 = shapePickerRecyclerView.A07;
                        r07.A00 = intValue;
                        gridLayoutManager.A0Z(r07);
                        return;
                    }
                    throw new IllegalStateException("Must set adapter first");
                }
                return;
            case 44:
                ((AnonymousClass2OA) this.A00).A00.A0W((AnonymousClass2O9) this.A01);
                return;
            case 45:
                C53882dz r413 = (C53882dz) this.A00;
                AnonymousClass0Z9 r314 = (AnonymousClass0Z9) this.A01;
                AbstractC007503q r112 = r413.A00;
                if (r112 != null) {
                    ProductGalleryFragment productGalleryFragment = r413.A04;
                    if (productGalleryFragment.A0o().AAO()) {
                        productGalleryFragment.A0o().AQh(r112);
                        ((AbstractC16300pa) ((GalleryFragmentBase) productGalleryFragment).A03).A01.A00();
                        return;
                    }
                    productGalleryFragment.A01.A01(3);
                    boolean A092 = productGalleryFragment.A00.A09(r314.A01);
                    UserJid userJid2 = r314.A01;
                    String str4 = r314.A04;
                    ImageView imageView2 = r413.A02;
                    Integer valueOf = Integer.valueOf(imageView2.getWidth());
                    Integer valueOf2 = Integer.valueOf(imageView2.getHeight());
                    ActivityC004902h A0A = productGalleryFragment.A0A();
                    if (A0A != null) {
                        AnonymousClass2D8.A04(userJid2, str4, A092, valueOf, valueOf2, A0A, new Intent(A0A, ProductDetailActivity.class), 7);
                        return;
                    }
                    throw null;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                PointF pointF = (PointF) this.A01;
                if (groupAdminPickerActivity.A03.getVisibility() != 0 && pointF.y < groupAdminPickerActivity.A02.getY() + ((float) groupAdminPickerActivity.A02.getPaddingTop())) {
                    groupAdminPickerActivity.A06.A0D(4);
                    return;
                }
                return;
            case 47:
                C49482Qq r82 = (C49482Qq) this.A01;
                SupportTopicsActivity supportTopicsActivity = ((C49552Qx) this.A00).A00;
                String str5 = r82.A01;
                if (!TextUtils.isEmpty(str5)) {
                    String str6 = r82.A04;
                    Intent intent10 = new Intent(supportTopicsActivity, FaqItemActivityV2.class);
                    intent10.putExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content", str5);
                    if (!TextUtils.isEmpty(str6)) {
                        intent10.putExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url", str6);
                    }
                    supportTopicsActivity.startActivityForResult(intent10, 15);
                    return;
                }
                ArrayList<? extends Parcelable> arrayList4 = r82.A05;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    supportTopicsActivity.A0T(r82);
                    return;
                }
                MenuItem menuItem = supportTopicsActivity.A02;
                if (menuItem != null) {
                    menuItem.setVisible(r82.A06);
                }
                AnonymousClass0LW A04 = supportTopicsActivity.A04();
                SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("parent_topic", r82);
                bundle.putParcelableArrayList("topics", arrayList4);
                supportTopicsFragment.A0N(bundle);
                if (A04 != null) {
                    AnonymousClass0QB r414 = new AnonymousClass0QB(A04);
                    r414.A08(r82.A02);
                    ((AnonymousClass0QC) r414).A02 = R.anim.enter_from_right;
                    r414.A03 = R.anim.exit_to_left;
                    r414.A04 = R.anim.enter_from_left;
                    r414.A05 = R.anim.exit_to_right;
                    r414.A06(R.id.support_topics_container, supportTopicsFragment, null);
                    r414.A00();
                    supportTopicsActivity.A03.add(supportTopicsFragment);
                    return;
                }
                throw null;
            case 48:
                C02900Dx r213 = (C02900Dx) this.A01;
                AbstractView$OnCreateContextMenuListenerC56112i5 r113 = ((C60122oq) this.A00).A06;
                r113.A0o = null;
                r113.A0G();
                r113.A0T(r213);
                r113.A0o = r213;
                r113.A0R(r213);
                BottomSheetBehavior bottomSheetBehavior = r113.A0Z;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.A0D(4);
                    return;
                }
                return;
            case 49:
                C02900Dx r214 = (C02900Dx) this.A01;
                AbstractView$OnCreateContextMenuListenerC56112i5 r114 = ((C60132or) this.A00).A04;
                r114.A0o = null;
                r114.A0G();
                r114.A0T(r214);
                r114.A0o = r214;
                r114.A0R(r214);
                BottomSheetBehavior bottomSheetBehavior2 = r114.A0Z;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.A0D(4);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
