package com.whatsapp.util;

import X.AbstractActivityC60812rK;
import X.AbstractC24951Dr;
import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass09H;
import X.AnonymousClass0AR;
import X.AnonymousClass0FI;
import X.AnonymousClass0M2;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0PW;
import X.AnonymousClass0QU;
import X.AnonymousClass1QJ;
import X.AnonymousClass1S6;
import X.AnonymousClass1SD;
import X.AnonymousClass21P;
import X.AnonymousClass2C0;
import X.AnonymousClass2D8;
import X.AnonymousClass2DB;
import X.AnonymousClass2DH;
import X.AnonymousClass2Z6;
import X.C002001d;
import X.C006803i;
import X.C007003k;
import X.C03170Fb;
import X.C03500Gm;
import X.C05910Qz;
import X.C09040cC;
import X.C11100fi;
import X.C27701Rb;
import X.C27711Rc;
import X.C27741Rf;
import X.C27831Rq;
import X.C36901n6;
import X.C40131sg;
import X.C40761tn;
import X.C40771to;
import X.C41991vy;
import X.C42381wc;
import X.C42521wq;
import X.C42541ws;
import X.C42651x3;
import X.C42791xI;
import X.C48052Ks;
import X.C60182ow;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.CountryAndPhoneNumberFragment;
import com.whatsapp.GdprReportActivity;
import com.whatsapp.Licenses;
import com.whatsapp.MatchPhoneNumberFragment;
import com.whatsapp.MessageReplyActivity;
import com.whatsapp.ReportSpamDialogFragment;
import com.whatsapp.RequestPermissionRegistrationActivity;
import com.whatsapp.StatusPrivacyActivity;
import com.whatsapp.StatusRecipientsActivity;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.TosUpdateActivity;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordActivity;
import com.whatsapp.backup.encryptedbackup.PasswordInputActivity;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.companiondevice.LinkedDevicesLogoutAllConfirmationDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewOnClickCListenerShape11S0100000_I1_0 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape11S0100000_I1_0(C007003k r2) {
        this.A01 = 31;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape11S0100000_I1_0(C36901n6 r2) {
        this.A01 = 29;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape11S0100000_I1_0(MatchPhoneNumberFragment matchPhoneNumberFragment) {
        this.A01 = 22;
        this.A00 = matchPhoneNumberFragment;
    }

    public ViewOnClickCListenerShape11S0100000_I1_0(ProductDetailActivity productDetailActivity, C36901n6 r3, int i) {
        this.A01 = 38;
        this.A00 = r3;
    }

    public ViewOnClickCListenerShape11S0100000_I1_0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        Class A89;
        switch (this.A01) {
            case 0:
                Context context = (Context) this.A00;
                context.startActivity(new Intent(context, Licenses.class));
                return;
            case 1:
                AnonymousClass2DH r4 = (AnonymousClass2DH) this.A00;
                if (!(r4 instanceof GroupAddBlacklistPickerActivity)) {
                    StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) r4;
                    statusRecipientsActivity.setResult(-1, new Intent());
                    statusRecipientsActivity.APv(R.string.processing, R.string.register_wait_message);
                    statusRecipientsActivity.A01.ANC(new C40771to(statusRecipientsActivity, statusRecipientsActivity.A0Q, ((AnonymousClass2DH) statusRecipientsActivity).A0B), new Void[0]);
                    return;
                }
                GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) r4;
                if (groupAddBlacklistPickerActivity.A00) {
                    groupAddBlacklistPickerActivity.APm(new NobodyDeprecatedDialogFragment());
                    return;
                } else {
                    groupAddBlacklistPickerActivity.A0Z();
                    return;
                }
            case 2:
                GdprReportActivity gdprReportActivity = (GdprReportActivity) this.A00;
                AnonymousClass02M r3 = ((ActivityC004702f) gdprReportActivity).A0F;
                if (r3.A0H()) {
                    if (gdprReportActivity.A09 != null) {
                        gdprReportActivity.A09 = null;
                    }
                    C40131sg r2 = new C40131sg(gdprReportActivity, r3, gdprReportActivity.A0A, gdprReportActivity.A0I);
                    gdprReportActivity.A09 = r2;
                    gdprReportActivity.A0J.ANC(r2, new Void[0]);
                    return;
                }
                return;
            case 3:
                GdprReportActivity gdprReportActivity2 = (GdprReportActivity) this.A00;
                if (((ActivityC004702f) gdprReportActivity2).A0F.A0H()) {
                    C03500Gm r5 = gdprReportActivity2.A0A;
                    synchronized (r5) {
                        Log.i("gdpr/download-report");
                        AnonymousClass0M2 A04 = r5.A04();
                        if (A04 != null) {
                            r5.A0G.A06(A04, 0, new C60182ow(r5.A03, r5, r5.A0F, r5.A08, r5.A09, gdprReportActivity2));
                        } else {
                            Log.e("gdpr/download/no-message");
                        }
                    }
                    return;
                }
                return;
            case 4:
                ActivityC004702f r22 = (ActivityC004702f) this.A00;
                if (r22 != null) {
                    r22.APl(new GdprReportActivity.ShareReportConfirmationDialogFragment(), null);
                    return;
                }
                throw null;
            case 5:
                C002001d.A2O((Activity) this.A00, 0);
                return;
            case 6:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (messageReplyActivity.A0L.A0H(UserJid.of(messageReplyActivity.A0E))) {
                    C002001d.A2O(messageReplyActivity, 106);
                    return;
                }
                AnonymousClass2Z6 r32 = messageReplyActivity.A0B;
                ImageButton imageButton = messageReplyActivity.A04;
                boolean z = messageReplyActivity.A0I;
                int i = 2;
                if (z) {
                    i = 5;
                }
                r32.A0B(imageButton, i, !z);
                return;
            case 7:
                MessageReplyActivity messageReplyActivity2 = (MessageReplyActivity) this.A00;
                messageReplyActivity2.A0T();
                messageReplyActivity2.A0V();
                messageReplyActivity2.finish();
                return;
            case 8:
                ((Activity) this.A00).finish();
                return;
            case 9:
                C006803i.A0R((Activity) this.A00, "com.whatsapp");
                return;
            case 10:
                RequestPermissionRegistrationActivity requestPermissionRegistrationActivity = (RequestPermissionRegistrationActivity) this.A00;
                requestPermissionRegistrationActivity.A00.putExtra("request_permission_permitted", false);
                requestPermissionRegistrationActivity.setResult(0, requestPermissionRegistrationActivity.A00);
                requestPermissionRegistrationActivity.finish();
                return;
            case 11:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 12:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                dialogFragment.A0w(false, false);
                C006803i.A0R(dialogFragment.A0A(), "com.whatsapp");
                return;
            case 13:
                ((StatusPrivacyActivity) this.A00).A03.setChecked(true);
                return;
            case 14:
                ActivityC004902h r33 = (ActivityC004902h) this.A00;
                if (r33 != null) {
                    Intent intent = new Intent(r33, StatusRecipientsActivity.class);
                    intent.putExtra("is_black_list", true);
                    r33.startActivityForResult(intent, 0);
                    return;
                }
                throw null;
            case 15:
                ActivityC004902h r34 = (ActivityC004902h) this.A00;
                if (r34 != null) {
                    Intent intent2 = new Intent(r34, StatusRecipientsActivity.class);
                    intent2.putExtra("is_black_list", false);
                    r34.startActivityForResult(intent2, 0);
                    return;
                }
                throw null;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                StatusPrivacyActivity statusPrivacyActivity = (StatusPrivacyActivity) this.A00;
                if (statusPrivacyActivity.A03.isChecked()) {
                    statusPrivacyActivity.APv(R.string.processing, R.string.register_wait_message);
                    statusPrivacyActivity.A08.ANC(new C40761tn(statusPrivacyActivity, ((ActivityC004702f) statusPrivacyActivity).A0F, statusPrivacyActivity.A07, statusPrivacyActivity.A06, ((AnonymousClass2C0) statusPrivacyActivity).A01), new Void[0]);
                    return;
                }
                statusPrivacyActivity.finish();
                return;
            case 17:
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A00;
                textStatusComposerActivity.A0F = textStatusComposerActivity.A0G;
                textStatusComposerActivity.A0A = null;
                textStatusComposerActivity.A0T();
                return;
            case 18:
                TosUpdateActivity tosUpdateActivity = (TosUpdateActivity) this.A00;
                tosUpdateActivity.A00 = 1;
                tosUpdateActivity.A0T();
                if (!tosUpdateActivity.A0J.A00.getBoolean("tos_v2_page_2_ack", false)) {
                    AnonymousClass0AR r1 = tosUpdateActivity.A0D;
                    if (r1.A04.A06) {
                        Log.i("sendmethods/tosupdate/page-2");
                        r1.A08.A09(Message.obtain(null, 0, 171, 0));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                TosUpdateActivity tosUpdateActivity2 = (TosUpdateActivity) this.A00;
                if (tosUpdateActivity2.A01.getVisibility() != 0 || tosUpdateActivity2.A05.isChecked()) {
                    C03170Fb r52 = ((ActivityC004602e) tosUpdateActivity2).A08;
                    synchronized (r52) {
                        Log.i("tosupdate/onTosAccepted");
                        r52.A02.A00.edit().putLong("tos_v2_accepted_time", r52.A01.A05()).apply();
                    }
                    r52.A03();
                    tosUpdateActivity2.A0B = true;
                    tosUpdateActivity2.finish();
                    return;
                }
                if (tosUpdateActivity2.A02.getVisibility() != 0) {
                    tosUpdateActivity2.A02.startAnimation(AnonymousClass008.A02(0.0f, 1.0f, 120));
                    tosUpdateActivity2.A02.setVisibility(0);
                }
                C002001d.A2R(tosUpdateActivity2, tosUpdateActivity2.A0I, ((AnonymousClass2C0) tosUpdateActivity2).A01.A06(R.string.tos_age_announce));
                return;
            case AnonymousClass0PW.A01:
                TosUpdateActivity tosUpdateActivity3 = (TosUpdateActivity) this.A00;
                C03170Fb r42 = ((ActivityC004602e) tosUpdateActivity3).A08;
                synchronized (r42) {
                    Log.i("tosupdate/onTosStageOneDismissed");
                    r42.A02.A00.edit().putLong("tos_v2_last_stage_1_display_time", r42.A01.A05()).apply();
                }
                tosUpdateActivity3.A0B = true;
                tosUpdateActivity3.finish();
                return;
            case 21:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A00;
                AnonymousClass00T r23 = viewSharedContactArrayActivity.A0J;
                AnonymousClass02N r6 = viewSharedContactArrayActivity.A01;
                if (r6 != null) {
                    r23.ANC(new C11100fi(viewSharedContactArrayActivity, r6, viewSharedContactArrayActivity.A0M, viewSharedContactArrayActivity.A0N, viewSharedContactArrayActivity.getIntent().getBooleanExtra("has_number_from_url", false), AnonymousClass0FI.A06(viewSharedContactArrayActivity.getIntent().getBundleExtra("quoted_message")), AnonymousClass02U.A03(viewSharedContactArrayActivity.getIntent().getStringExtra("quoted_group_jid"))), new Void[0]);
                    return;
                }
                throw null;
            case 22:
                ((CountryAndPhoneNumberFragment) this.A00).A0n();
                return;
            case 23:
                ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) this.A00;
                Editable text = confirmPasswordActivity.A00.getText();
                if (!TextUtils.isEmpty(text)) {
                    String obj = text.toString();
                    if (!obj.equals(confirmPasswordActivity.A03)) {
                        confirmPasswordActivity.A00.setError(((AnonymousClass2C0) confirmPasswordActivity).A01.A06(R.string.encrypted_backup_confirm_password_mismatch_error));
                        return;
                    }
                    confirmPasswordActivity.A0G(R.string.encrypted_backup_progress_text_when_enabling);
                    AnonymousClass1QJ r24 = new AnonymousClass1QJ(confirmPasswordActivity);
                    confirmPasswordActivity.A01 = r24;
                    r24.execute(obj);
                    return;
                }
                return;
            case 24:
                PasswordInputActivity passwordInputActivity = (PasswordInputActivity) this.A00;
                if (passwordInputActivity.A00.getText() != null) {
                    Intent intent3 = new Intent(passwordInputActivity, ConfirmPasswordActivity.class);
                    intent3.putExtra("password", passwordInputActivity.A00.getText().toString());
                    passwordInputActivity.startActivityForResult(intent3, 200);
                    return;
                }
                return;
            case 25:
                CartFragment cartFragment = (CartFragment) this.A00;
                if (cartFragment.A0M.A0H(cartFragment.A0K)) {
                    C002001d.A2O(cartFragment.A0A(), 106);
                    return;
                }
                cartFragment.A0L = true;
                ((ActivityC004702f) cartFragment.A0B()).A0G(R.string.cart_sending);
                C41991vy r25 = cartFragment.A0G;
                List<C27711Rc> list = cartFragment.A0F.A00;
                C27701Rb r0 = r25.A0D;
                C42541ws r62 = r0.A0D;
                UserJid userJid = r0.A0E;
                r62.A00 = r0.A0F;
                String A02 = r62.A03.A02();
                AnonymousClass09H r15 = r62.A03;
                ArrayList arrayList = new ArrayList();
                for (C27711Rc r13 : list) {
                    ArrayList arrayList2 = new ArrayList();
                    C48052Ks r8 = r13.A01;
                    arrayList2.add(new AnonymousClass0M5("id", (AnonymousClass0OS[]) null, r8.A06));
                    arrayList2.add(new AnonymousClass0M5("name", (AnonymousClass0OS[]) null, r8.A08));
                    arrayList2.add(new AnonymousClass0M5("quantity", (AnonymousClass0OS[]) null, Long.toString(r13.A00)));
                    BigDecimal bigDecimal = r8.A09;
                    if (bigDecimal != null) {
                        arrayList2.add(new AnonymousClass0M5("price", (AnonymousClass0OS[]) null, Long.toString(bigDecimal.multiply(AnonymousClass1S6.A0A).longValue())));
                    }
                    C05910Qz r02 = r8.A01;
                    if (r02 != null) {
                        arrayList2.add(new AnonymousClass0M5("currency", (AnonymousClass0OS[]) null, r02.A00));
                    }
                    arrayList.add(new AnonymousClass0M5("product", null, (AnonymousClass0M5[]) arrayList2.toArray(new AnonymousClass0M5[0]), null));
                }
                r15.A06(252, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("smax_id", "10", null, (byte) 0), new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, new AnonymousClass0M5("order", new AnonymousClass0OS[]{new AnonymousClass0OS("op", "create", null, (byte) 0), new AnonymousClass0OS("biz_jid", userJid.getRawString(), null, (byte) 0)}, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null)), r62, 32000);
                AnonymousClass008.A14("CreateOrderProtocol/sendOrderMutationRequest biz_jid=", userJid);
                return;
            case 26:
            case 28:
                CartFragment cartFragment2 = (CartFragment) this.A00;
                C41991vy r12 = cartFragment2.A0G;
                C27741Rf r03 = r12.A0E;
                UserJid userJid2 = r12.A0J;
                if (r03 != null) {
                    ActivityC004902h A0B = cartFragment2.A0B();
                    if (A0B instanceof CatalogListActivity) {
                        cartFragment2.A0w(false, false);
                        return;
                    }
                    Intent intent4 = new Intent(A0B, CatalogListActivity.class);
                    intent4.putExtra("cache_jid", userJid2.getRawString());
                    intent4.addFlags(603979776);
                    A0B.startActivity(intent4);
                    return;
                }
                throw null;
            case 27:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 29:
            case 38:
                ((AbstractC24951Dr) this.A00).A02(3);
                return;
            case 30:
                AnonymousClass2D8 r53 = (AnonymousClass2D8) this.A00;
                C48052Ks r14 = r53.A0B;
                if (r14 != null && r53.A0U()) {
                    String str = r14.A05;
                    StringBuilder A0S = AnonymousClass008.A0S("https://l.wl.co/l?u=");
                    A0S.append(Uri.encode(str));
                    ((ActivityC004602e) r53).A04.A05(view.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(A0S.toString())));
                    r53.A0H.A02(7, 26, null, r53.A0C);
                    return;
                }
                return;
            case 31:
                view.getContext().startActivity(Conversation.A04(view.getContext(), (C007003k) this.A00));
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                if (this.A00 == null) {
                    throw null;
                }
                return;
            case 33:
                CatalogMediaViewFragment catalogMediaViewFragment = ((C42381wc) this.A00).A00;
                catalogMediaViewFragment.A10(!((MediaViewBaseFragment) catalogMediaViewFragment).A0G, true);
                return;
            case 34:
                CatalogReportReasonDialogFragment catalogReportReasonDialogFragment = (CatalogReportReasonDialogFragment) this.A00;
                if (catalogReportReasonDialogFragment.A00 == -1) {
                    catalogReportReasonDialogFragment.A01.A0C(catalogReportReasonDialogFragment.A02.A06(R.string.catalog_product_report_select_reason_toast), 1);
                    return;
                }
                ((ProductDetailActivity) catalogReportReasonDialogFragment.A0B()).A0W(catalogReportReasonDialogFragment.A03[catalogReportReasonDialogFragment.A00].A01);
                catalogReportReasonDialogFragment.A0r();
                return;
            case 35:
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A00;
                ((AnonymousClass2DB) catalogListActivity).A07.A04(32, null, ((AnonymousClass2DB) catalogListActivity).A03, null);
                C42521wq r16 = catalogListActivity.A01;
                AnonymousClass1SD r04 = r16.A02;
                UserJid userJid3 = r16.A03;
                if (r04 != null) {
                    CartFragment cartFragment3 = new CartFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("extra_business_id", userJid3);
                    cartFragment3.A0N(bundle);
                    catalogListActivity.APm(cartFragment3);
                    return;
                }
                throw null;
            case 36:
                ProductDetailActivity productDetailActivity = (ProductDetailActivity) this.A00;
                C42791xI r05 = productDetailActivity.A03;
                C48052Ks r43 = ((AnonymousClass2D8) productDetailActivity).A0B;
                if (r05 != null) {
                    if (r43 != null) {
                        C42651x3 r35 = r05.A08;
                        r35.A0A.ANF(new RunnableEBaseShape6S0200000_I1_1(r35, r43, 44));
                    }
                    productDetailActivity.A00.setEnabled(false);
                    return;
                }
                throw null;
            case 37:
                Context context2 = view.getContext();
                AnonymousClass2D8 r26 = (AnonymousClass2D8) this.A00;
                ((ActivityC004602e) r26).A04.A05(context2, ContactInfoActivity.A04(r26.A0C, context2));
                return;
            case 39:
                ProductDetailActivity productDetailActivity2 = (ProductDetailActivity) this.A00;
                C27831Rq r44 = productDetailActivity2.A0B;
                C48052Ks r06 = ((AnonymousClass2D8) productDetailActivity2).A0B;
                r44.A04(33, r06 == null ? null : r06.A06, ((AnonymousClass2D8) productDetailActivity2).A0C, null);
                productDetailActivity2.A03.A02(productDetailActivity2);
                return;
            case 40:
                ProductDetailActivity productDetailActivity3 = (ProductDetailActivity) this.A00;
                C27831Rq r45 = productDetailActivity3.A0B;
                C48052Ks r07 = ((AnonymousClass2D8) productDetailActivity3).A0B;
                r45.A04(32, r07 == null ? null : r07.A06, ((AnonymousClass2D8) productDetailActivity3).A0C, null);
                productDetailActivity3.A03.A02(productDetailActivity3);
                return;
            case 41:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.APm(ReportSpamDialogFragment.A00(contactInfoActivity.A0h(), "account_info"));
                return;
            case 42:
                ContactInfoActivity contactInfoActivity2 = (ContactInfoActivity) this.A00;
                Intent intent5 = new Intent(contactInfoActivity2, IdentityVerificationActivity.class);
                intent5.putExtra("jid", contactInfoActivity2.A0h().getRawString());
                contactInfoActivity2.startActivity(intent5);
                return;
            case 43:
                ContactInfoActivity contactInfoActivity3 = (ContactInfoActivity) this.A00;
                ArrayList A002 = contactInfoActivity3.A0J.A00(contactInfoActivity3.A0h());
                A002.size();
                Intent intent6 = new Intent(contactInfoActivity3, ViewSharedContactArrayActivity.class);
                intent6.putExtra("edit_mode", false);
                intent6.putParcelableArrayListExtra("vcard_sender_infos", A002);
                contactInfoActivity3.startActivity(intent6);
                return;
            case 44:
                AnonymousClass21P r27 = new AnonymousClass21P();
                r27.A00 = 7;
                ContactInfoActivity contactInfoActivity4 = (ContactInfoActivity) this.A00;
                contactInfoActivity4.A0r.A0B(r27, null, false);
                try {
                    contactInfoActivity4.startActivityForResult(contactInfoActivity4.A11.A02(contactInfoActivity4.A0G, contactInfoActivity4.A0h(), true), 10);
                    contactInfoActivity4.A0I.A02(true, 3);
                    return;
                } catch (ActivityNotFoundException unused) {
                    ((ActivityC004702f) contactInfoActivity4).A0F.A06(R.string.unimplemented, 0);
                    return;
                }
            case 45:
                ContactInfoActivity contactInfoActivity5 = (ContactInfoActivity) this.A00;
                if (((ChatInfoActivity) contactInfoActivity5).A0E.A04() && (A89 = ((ChatInfoActivity) contactInfoActivity5).A0F.A03().A89()) != null) {
                    contactInfoActivity5.startActivity(new Intent(contactInfoActivity5, A89).putExtra("extra_jid", contactInfoActivity5.A0h().getRawString()));
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                ContactInfoActivity contactInfoActivity6 = (ContactInfoActivity) this.A00;
                contactInfoActivity6.A0v.A08(contactInfoActivity6, contactInfoActivity6.A0h(), null);
                return;
            case 47:
                ListChatInfo listChatInfo = (ListChatInfo) this.A00;
                ChatInfoActivity.EncryptionExplanationDialogFragment.A00(listChatInfo.A0g(), 1, null).A0u(listChatInfo.A04(), null);
                return;
            case 48:
                AbstractActivityC60812rK r17 = (AbstractActivityC60812rK) this.A00;
                if (!r17.A0Q(R.string.connectivity_check_connection)) {
                    new LinkedDevicesLogoutAllConfirmationDialogFragment(r17.A01).A0u(r17.A04(), null);
                    return;
                }
                return;
            case 49:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                C09040cC r36 = contactPickerFragment.A19;
                ActivityC004902h A0A = contactPickerFragment.A0A();
                boolean z2 = contactPickerFragment.A0p;
                int i2 = 2;
                if (z2) {
                    i2 = 5;
                }
                r36.A02(A0A, Integer.valueOf(i2));
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
