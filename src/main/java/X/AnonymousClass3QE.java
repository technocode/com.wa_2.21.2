package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3QE  reason: invalid class name */
public class AnonymousClass3QE extends AnonymousClass0JW {
    public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
    public final AnonymousClass0H4 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public AnonymousClass3QE(String str, String str2, String str3, AnonymousClass0H4 r5, ActivityC004902h r6) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = r5;
        this.A05 = new WeakReference(r6);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004902h r5 = (ActivityC004902h) this.A05.get();
        if (r5 != null) {
            String str = this.A03;
            String str2 = this.A02;
            String str3 = this.A04;
            Bundle bundle = new Bundle();
            bundle.putString("sticker_pack_id", str);
            bundle.putString("sticker_pack_authority", str2);
            bundle.putString("sticker_pack_name", str3);
            AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = new AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment();
            addStickerPackDialogFragment.A0N(bundle);
            this.A00 = addStickerPackDialogFragment;
            addStickerPackDialogFragment.A0u(r5.A04(), "add");
        }
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        String str = this.A03;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A04)) {
                try {
                    AnonymousClass0H4 r0 = this.A01;
                    r0.A01(str2, str);
                    if (r0.A06.A03(str2, str)) {
                        return new AnonymousClass337(0, null);
                    }
                    return new AnonymousClass337(1, null);
                } catch (Exception e) {
                    Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e);
                    return new AnonymousClass337(2, e.getMessage());
                }
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("one of the follow fields are empty. pack id:");
        A0S.append(str);
        A0S.append(",authority:");
        A0S.append(this.A02);
        A0S.append(",sticker pack name:");
        A0S.append(this.A04);
        return new AnonymousClass337(2, A0S.toString());
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass337 r9 = (AnonymousClass337) obj;
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0W) {
            int i = r9.A00;
            if (i == 0) {
                AnonymousClass01X r3 = addStickerPackDialogFragment.A06;
                addStickerPackDialogFragment.A0x(r3.A0D(R.string.sticker_third_party_pack_added_already_with_app, addStickerPackDialogFragment.A02, r3.A06(R.string.localized_app_name)), 8, 0, 8);
                Activity activity = (Activity) this.A05.get();
                if (activity != null) {
                    Intent intent = new Intent();
                    intent.putExtra("already_added", true);
                    activity.setResult(-1, intent);
                }
            } else if (i == 1) {
                AnonymousClass01X r32 = addStickerPackDialogFragment.A06;
                addStickerPackDialogFragment.A0x(r32.A0D(R.string.add_third_party_sticker_pack_with_app, addStickerPackDialogFragment.A02, r32.A06(R.string.localized_app_name)), 8, 8, 0);
            } else if (i == 2) {
                AnonymousClass01X r33 = addStickerPackDialogFragment.A06;
                addStickerPackDialogFragment.A0x(r33.A0D(R.string.sticker_third_party_pack_invalid_with_app, r33.A06(R.string.localized_app_name)), 8, 0, 8);
                Activity activity2 = (Activity) this.A05.get();
                if (activity2 != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("validation_error", r9.A01);
                    activity2.setResult(0, intent2);
                }
            }
        }
    }
}
