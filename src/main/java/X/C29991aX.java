package X;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1aX  reason: invalid class name and case insensitive filesystem */
public class C29991aX extends AnonymousClass0Hs {
    public C14610mZ A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A03 = new ArrayList();

    public C29991aX(C14610mZ r3) {
        if (!TextUtils.isEmpty(r3.A01)) {
            this.A00 = r3;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    @Override // X.AnonymousClass0Hs
    public void A05(Bundle bundle) {
        bundle.putCharSequence("android.selfDisplayName", this.A00.A01);
        bundle.putBundle("android.messagingStyleUser", this.A00.A01());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A02);
        CharSequence charSequence = this.A02;
        if (charSequence != null && this.A01.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A03;
        if (!list.isEmpty()) {
            Parcelable[] parcelableArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C14560mU r7 = (C14560mU) list.get(i);
                if (r7 != null) {
                    Bundle bundle2 = new Bundle();
                    CharSequence charSequence2 = r7.A05;
                    if (charSequence2 != null) {
                        bundle2.putCharSequence("text", charSequence2);
                    }
                    bundle2.putLong("time", r7.A03);
                    C14610mZ r0 = r7.A04;
                    if (r0 != null) {
                        bundle2.putCharSequence("sender", r0.A01);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle2.putParcelable("sender_person", r7.A04.A00());
                        } else {
                            bundle2.putBundle("person", r7.A04.A01());
                        }
                    }
                    String str = r7.A02;
                    if (str != null) {
                        bundle2.putString("type", str);
                    }
                    Uri uri = r7.A00;
                    if (uri != null) {
                        bundle2.putParcelable("uri", uri);
                    }
                    Bundle bundle3 = r7.A01;
                    if (bundle3 != null) {
                        bundle2.putBundle("extras", bundle3);
                    }
                    parcelableArr[i] = bundle2;
                } else {
                    throw null;
                }
            }
            bundle.putParcelableArray("android.messages", parcelableArr);
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e2, code lost:
        if (r0 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r10.A02 == null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
    @Override // X.AnonymousClass0Hs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AbstractC14530mR r11) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29991aX.A06(X.0mR):void");
    }

    public final CharSequence A07(C14560mU r14) {
        CharSequence charSequence;
        int i;
        C06570Tw A022 = C06570Tw.A02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = false;
        int i2 = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
            i2 = -16777216;
        }
        C14610mZ r0 = r14.A04;
        CharSequence charSequence2 = "";
        if (r0 == null) {
            charSequence = charSequence2;
        } else {
            charSequence = r0.A01;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.A00.A01;
            if (z && (i = super.A00.A00) != 0) {
                i2 = i;
            }
        }
        AbstractC06520Tq r2 = A022.A01;
        CharSequence A032 = A022.A03(charSequence, r2);
        spannableStringBuilder.append(A032);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null), spannableStringBuilder.length() - A032.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = r14.A05;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append(A022.A03(charSequence2, r2));
        return spannableStringBuilder;
    }
}
