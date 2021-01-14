package X;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: X.0mc  reason: invalid class name and case insensitive filesystem */
public final class C14630mc {
    public final Bundle A00;
    public final CharSequence A01;
    public final String A02;
    public final Set A03;
    public final boolean A04 = true;
    public final CharSequence[] A05;

    public C14630mc(String str, CharSequence charSequence, CharSequence[] charSequenceArr, Bundle bundle, Set set) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A05 = charSequenceArr;
        this.A00 = bundle;
        this.A03 = set;
    }

    public static Bundle A00(Intent intent) {
        Intent intent2;
        if (Build.VERSION.SDK_INT >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            ClipDescription description = clipData.getDescription();
            if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals("android.remoteinput.results") && (intent2 = clipData.getItemAt(0).getIntent()) != null) {
                return (Bundle) intent2.getExtras().getParcelable("android.remoteinput.resultsData");
            }
        }
        return null;
    }

    public static RemoteInput[] A01(C14630mc[] r6) {
        int length = r6.length;
        RemoteInput[] remoteInputArr = new RemoteInput[length];
        for (int i = 0; i < length; i++) {
            C14630mc r2 = r6[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(r2.A02).setLabel(r2.A01).setChoices(r2.A05).setAllowFreeFormInput(r2.A04).addExtras(r2.A00);
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(0);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
