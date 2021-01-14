package com.whatsapp;

import X.AbstractC007503q;
import X.AnonymousClass00C;
import X.AnonymousClass0FI;
import X.AnonymousClass1VY;
import X.AnonymousClass2PG;
import X.C002001d;
import X.C006803i;
import X.C02230Bd;
import X.C08340aw;
import X.C26791Mo;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GifHelper {
    public static native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    public static native boolean hasGifTag(String str);

    public static Intent A00(File file, Activity activity, MentionableEntry mentionableEntry, List list, AbstractC007503q r17) {
        ArrayList A0F;
        String str;
        long j;
        String str2;
        Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fromFile);
        String A1l = C002001d.A1l(mentionableEntry.getStringText());
        AnonymousClass2PG r1 = new AnonymousClass2PG(fromFile);
        r1.A0A(A1l);
        r1.A0B(C006803i.A0M(mentionableEntry.getMentions()));
        C08340aw r0 = new C08340aw(r1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bundle bundle = new Bundle();
        r0.A02(bundle);
        if (list.size() == 1) {
            str = AnonymousClass1VY.A0D((Jid) list.get(0));
            A0F = null;
        } else {
            A0F = AnonymousClass1VY.A0F(list);
            str = null;
        }
        if (r17 != null) {
            j = r17.A0p;
            str2 = AnonymousClass1VY.A0D(AnonymousClass0FI.A05(r17));
        } else {
            j = 0;
            str2 = null;
        }
        Intent intent = new Intent(activity, MediaPreviewActivity.class);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", str);
        intent.putExtra("jids", A0F);
        intent.putExtra("max_items", 0);
        intent.putExtra("origin", 9);
        intent.putExtra("picker_open_time", elapsedRealtime);
        intent.putExtra("send", true);
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", str2);
        intent.putExtra("number_from_url", false);
        intent.putExtra("media_preview_params", bundle);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", (Parcelable) null);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", false);
        return intent;
    }

    public static void A01(AnonymousClass00C r5, File file) {
        try {
            File A06 = r5.A06(file);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(file.getAbsolutePath(), A06.getAbsolutePath());
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                throw new C26791Mo(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder sb = new StringBuilder();
                sb.append("gif-helper/applyGifTag");
                sb.append(applyGifTag.errorMessage);
                Log.e(sb.toString());
                int i = applyGifTag.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid result, error_code: ");
                sb2.append(i);
                throw new C26791Mo(i, sb2.toString());
            } else if (C02230Bd.A0U(r5, A06, file)) {
                Log.d("applyGifTag succeeded");
            } else {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                throw new C26791Mo(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            }
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new C26791Mo(0, "Could not access file or failed to move files properly");
        }
    }

    public static boolean A02(File file) {
        return file != null && hasGifTag(file.getAbsolutePath());
    }
}
