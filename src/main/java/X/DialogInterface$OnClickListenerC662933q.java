package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.33q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC662933q implements DialogInterface.OnClickListener {
    public final /* synthetic */ ThirdPartyPackPage$StickerBlockedDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC662933q(ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment) {
        this.A00 = thirdPartyPackPage$StickerBlockedDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment = this.A00;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                Context A002 = thirdPartyPackPage$StickerBlockedDialogFragment.A00();
                if (!(A002 == null || A002.getPackageManager() == null || thirdPartyPackPage$StickerBlockedDialogFragment.A00().getPackageManager().getPackageInfo("com.samsung.android.lool", 128) == null)) {
                    try {
                        thirdPartyPackPage$StickerBlockedDialogFragment.A0h(new Intent("android.intent.action.VIEW").setPackage("com.samsung.android.lool"));
                        return;
                    } catch (ActivityNotFoundException unused) {
                        Log.e("Sticker/ThirdPartyPackPage/cannot launch com.samsung.android.lool");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        try {
            thirdPartyPackPage$StickerBlockedDialogFragment.A0h(new Intent("android.intent.action.POWER_USAGE_SUMMARY"));
        } catch (ActivityNotFoundException unused3) {
            Log.e("Sticker/ThirdPartyPackPage/cannot launch power usage");
        }
    }
}
