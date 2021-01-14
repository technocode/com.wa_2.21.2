package com.facebook.redex;

import X.AbstractC007503q;
import X.AbstractC16300pa;
import X.AbstractC49792Sd;
import X.AbstractC63952xH;
import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import X.ActivityC004702f;
import X.AnonymousClass0M2;
import X.AnonymousClass0PW;
import X.AnonymousClass0ZD;
import X.AnonymousClass2MF;
import X.AnonymousClass2PF;
import X.AnonymousClass2RM;
import X.AnonymousClass2RN;
import X.C002001d;
import X.C006803i;
import X.C02770Dj;
import X.C53602dX;
import X.C53682df;
import X.C53732dk;
import X.C54482ez;
import X.C55412gV;
import X.C60142os;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.ephemeral.EphemeralNUXDialog;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.gallerypicker.VideoPreviewFragment;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.group.NewGroup;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.instrumentation.ui.DisclosureFragment;
import com.whatsapp.instrumentation.ui.PermissionsFragment;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Set;

public class ViewOnClickEBaseShape6S0100000_I1_4 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape6S0100000_I1_4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                EphemeralNUXDialog ephemeralNUXDialog = (EphemeralNUXDialog) this.A00;
                Intent intent = new Intent("android.intent.action.VIEW", ephemeralNUXDialog.A04.A02("chats", "about-disappearing-messages"));
                intent.addFlags(268435456);
                ephemeralNUXDialog.A02.A05(view.getContext(), intent);
                ephemeralNUXDialog.A03.A00.edit().putBoolean("ephemeral_nux", true).apply();
                ephemeralNUXDialog.A0r();
                return;
            case 1:
                ((Runnable) this.A00).run();
                return;
            case 2:
                C53602dX r1 = (C53602dX) this.A00;
                r1.A08(1);
                ((AbstractC16300pa) r1).A01.A00();
                return;
            case 3:
                C53682df r0 = (C53682df) this.A00;
                AnonymousClass0M2 r8 = r0.A00;
                if (r8 != null) {
                    DocumentsGalleryFragment documentsGalleryFragment = r0.A0A;
                    if (documentsGalleryFragment.A0o().AAO()) {
                        documentsGalleryFragment.A0o().AQh(r8);
                        ((AbstractC16300pa) ((GalleryFragmentBase) documentsGalleryFragment).A03).A01.A00();
                        return;
                    }
                    AnonymousClass0ZD.A07(documentsGalleryFragment.A06, documentsGalleryFragment.A02, documentsGalleryFragment.A01, documentsGalleryFragment.A07, documentsGalleryFragment.A05, (ActivityC004702f) documentsGalleryFragment.A0A(), r8, documentsGalleryFragment.A00);
                    return;
                }
                return;
            case 4:
                C53732dk r5 = (C53732dk) this.A00;
                AbstractC007503q r2 = r5.A01;
                if (r2 != null) {
                    LinksGalleryFragment linksGalleryFragment = r5.A0B;
                    if (linksGalleryFragment.A0o().AAO()) {
                        linksGalleryFragment.A0o().AQh(r2);
                        ((AbstractC16300pa) ((GalleryFragmentBase) linksGalleryFragment).A03).A01.A00();
                        return;
                    }
                    Intent A05 = Conversation.A05(linksGalleryFragment.A00(), r2.A0n.A00);
                    A05.putExtra("row_id", r5.A01.A0p);
                    C006803i.A05(A05, r5.A01.A0n);
                    linksGalleryFragment.A0h(A05);
                    return;
                }
                return;
            case 5:
                C53732dk r4 = (C53732dk) this.A00;
                AbstractC007503q r12 = r4.A01;
                if (r12 != null) {
                    LinksGalleryFragment linksGalleryFragment2 = r4.A0B;
                    if (linksGalleryFragment2.A0o().AAO()) {
                        linksGalleryFragment2.A0o().AQh(r12);
                        ((AbstractC16300pa) ((GalleryFragmentBase) linksGalleryFragment2).A03).A01.A00();
                        return;
                    } else if (!TextUtils.isEmpty(r4.A02)) {
                        Set set = r4.A03;
                        if (set != null) {
                            ((ActivityC004702f) linksGalleryFragment2.A0A()).APm(SuspiciousLinkWarningDialogFragment.A00(r4.A02, set));
                            return;
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(r4.A02));
                        intent2.putExtra("com.android.browser.application_id", linksGalleryFragment2.A00().getPackageName());
                        intent2.putExtra("create_new_tab", true);
                        linksGalleryFragment2.A01.A05(linksGalleryFragment2.A00(), intent2);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                ((MediaPreviewFragment) this.A00).A02.A0B();
                return;
            case 7:
                ((MediaPreviewActivity) this.A00).lambda$onCreate$2093$MediaPreviewActivity(view);
                return;
            case 8:
                ((MediaPreviewActivity) this.A00).lambda$onCreate$2092$MediaPreviewActivity(view);
                return;
            case 9:
                ((MediaPreviewActivity) this.A00).lambda$setupViewOnce$2097$MediaPreviewActivity(view);
                return;
            case 10:
                VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) this.A00;
                AnonymousClass2MF r13 = ((MediaPreviewFragment) videoPreviewFragment).A01;
                if (r13.A04.A0Y) {
                    r13.A01();
                }
                videoPreviewFragment.A0y();
                return;
            case 11:
                ((VideoPreviewFragment) this.A00).A0y();
                return;
            case 12:
                VideoPreviewFragment videoPreviewFragment2 = (VideoPreviewFragment) this.A00;
                if (!videoPreviewFragment2.A0N) {
                    boolean z = !videoPreviewFragment2.A0L;
                    videoPreviewFragment2.A0L = z;
                    ((AnonymousClass2PF) videoPreviewFragment2.A0A()).AOa(((MediaPreviewFragment) videoPreviewFragment2).A00, z);
                    videoPreviewFragment2.A0z();
                    videoPreviewFragment2.A0J.A0A(videoPreviewFragment2.A0L);
                    videoPreviewFragment2.A0w();
                    return;
                }
                return;
            case 13:
                VideoPreviewFragment videoPreviewFragment3 = (VideoPreviewFragment) this.A00;
                boolean z2 = !videoPreviewFragment3.A0N;
                videoPreviewFragment3.A0N = z2;
                ((AnonymousClass2PF) videoPreviewFragment3.A0A()).AP4(((MediaPreviewFragment) videoPreviewFragment3).A00, z2);
                if (videoPreviewFragment3.A0N) {
                    videoPreviewFragment3.A0C.setImageResource(R.drawable.ic_gif_on);
                    videoPreviewFragment3.A0G.A0E = 7000;
                    videoPreviewFragment3.A0x();
                    C002001d.A2R(videoPreviewFragment3.A0B(), videoPreviewFragment3.A0T, videoPreviewFragment3.A0U.A06(R.string.gif_selected));
                } else {
                    videoPreviewFragment3.A0C.setImageResource(R.drawable.ic_gif_off);
                    videoPreviewFragment3.A0G.A0E = videoPreviewFragment3.A01;
                    if (videoPreviewFragment3.A0J.A0B()) {
                        videoPreviewFragment3.A0v();
                    }
                    videoPreviewFragment3.A0J.A09((int) videoPreviewFragment3.A03);
                    C002001d.A2R(videoPreviewFragment3.A0B(), videoPreviewFragment3.A0T, videoPreviewFragment3.A0U.A06(R.string.video_selected));
                }
                videoPreviewFragment3.A0z();
                videoPreviewFragment3.A0w();
                return;
            case 14:
                AbstractC63952xH r14 = ((C54482ez) this.A00).A0A;
                if (r14 != null) {
                    r14.A01(0, true);
                    return;
                }
                return;
            case 15:
                AbstractC63952xH r02 = ((C54482ez) this.A00).A0A;
                if (r02 != null) {
                    r02.A01(1, true);
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                ((GroupAdminPickerActivity) this.A00).A0U();
                return;
            case 17:
                ((GroupAdminPickerActivity) this.A00).lambda$new$2124$GroupAdminPickerActivity(view);
                return;
            case 18:
                ((GroupChatInfo) this.A00).lambda$onCreate$2140$GroupChatInfo(view);
                return;
            case 19:
                ((GroupChatInfo) this.A00).lambda$onCreate$2141$GroupChatInfo(view);
                return;
            case AnonymousClass0PW.A01:
                ((GroupChatInfo) this.A00).lambda$updateEphemeralMessagesSetting$2148$GroupChatInfo(view);
                return;
            case 21:
                ((GroupChatInfo) this.A00).lambda$onCreate$2138$GroupChatInfo(view);
                return;
            case 22:
                ((GroupSettingsActivity.AdminSettingsDialogFragment) this.A00).A02[0] = true;
                return;
            case 23:
                ((GroupSettingsActivity.AdminSettingsDialogFragment) this.A00).A02[0] = false;
                return;
            case 24:
                ((NewGroup) this.A00).lambda$onCreate$2172$NewGroup(view);
                return;
            case 25:
                ((IdentityVerificationActivity) this.A00).lambda$onCreate$2184$IdentityVerificationActivity(view);
                return;
            case 26:
                ((IdentityVerificationActivity) this.A00).A0X();
                return;
            case 27:
                ((ActivityC004702f) this.A00).onBackPressed();
                return;
            case 28:
                ((FaqItemActivityV2) this.A00).lambda$onCreate$2203$FaqItemActivityV2(view);
                return;
            case 29:
                ((SupportTopicsActivity) this.A00).A0T(null);
                return;
            case 30:
                ((SupportTopicsActivity) this.A00).onBackPressed();
                return;
            case 31:
                AnonymousClass2RM r03 = ((DisclosureFragment) this.A00).A00;
                if (r03 != null) {
                    r03.ACX();
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                AnonymousClass2RN r04 = ((PermissionsFragment) this.A00).A00;
                if (r04 != null) {
                    r04.AI0();
                    return;
                }
                return;
            case 33:
                C55412gV r15 = (C55412gV) this.A00;
                r15.A02 = true;
                ((AbstractC16300pa) r15).A01.A00();
                return;
            case 34:
                ((Activity) this.A00).finish();
                return;
            case 35:
                ((Activity) this.A00).finish();
                return;
            case 36:
                ((Activity) this.A00).finish();
                return;
            case 37:
                ((Activity) this.A00).finish();
                return;
            case 38:
                ((GroupChatLiveLocationsActivity) this.A00).lambda$onCreate$2240$GroupChatLiveLocationsActivity(view);
                return;
            case 39:
                ((GroupChatLiveLocationsActivity2) this.A00).lambda$onCreate$2247$GroupChatLiveLocationsActivity2(view);
                return;
            case 40:
                AbstractView$OnCreateContextMenuListenerC56112i5 r3 = ((C60142os) this.A00).A00;
                if (!r3.A0r) {
                    Activity activity = r3.A0E;
                    activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_location).putExtra("permissions", C02770Dj.A07).putExtra("perm_denial_message_id", R.string.permission_location_access_on_sending_location).putExtra("message_id", R.string.permission_location_access_on_sending_location_request), 34);
                    return;
                }
                r3.A1F.A06(r3.A0E, r3.A0e);
                return;
            case 41:
                ((LocationPicker) this.A00).lambda$onCreate$2271$LocationPicker(view);
                return;
            case 42:
                ((LocationPicker) this.A00).lambda$onCreate$2272$LocationPicker(view);
                return;
            case 43:
                ((LocationPicker2) this.A00).lambda$onCreate$2279$LocationPicker2(view);
                return;
            case 44:
                ((LocationPicker2) this.A00).lambda$onCreate$2278$LocationPicker2(view);
                return;
            case 45:
                ((AbstractC49792Sd) this.A00).A0A();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                ((AbstractC49792Sd) this.A00).A0R(true);
                return;
            case 47:
                AbstractC49792Sd r16 = (AbstractC49792Sd) this.A00;
                r16.A0N(r16.A10);
                return;
            case 48:
                AbstractC49792Sd r32 = (AbstractC49792Sd) this.A00;
                View findViewById = r32.A0T.findViewById(R.id.location_description);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                boolean z3 = !r32.A0o;
                r32.A0o = z3;
                float f = -0.5f;
                if (z3) {
                    f = 0.5f;
                }
                r32.A0S(true, Float.valueOf(f));
                return;
            case 49:
                ((MediaViewBaseFragment) this.A00).A0w();
                return;
            default:
                return;
        }
    }
}
