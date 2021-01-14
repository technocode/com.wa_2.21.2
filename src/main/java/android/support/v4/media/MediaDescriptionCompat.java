package android.support.v4.media;

import X.C12620iQ;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12620iQ();
    public Object A00;
    public final Bitmap A01;
    public final Uri A02;
    public final Uri A03;
    public final Bundle A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final String A08;

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A07 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A06 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A05 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.A01 = (Bitmap) parcel.readParcelable(classLoader);
        this.A02 = (Uri) parcel.readParcelable(classLoader);
        this.A04 = parcel.readBundle(classLoader);
        this.A03 = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.A08 = str;
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A05 = charSequence3;
        this.A01 = bitmap;
        this.A02 = uri;
        this.A04 = bundle;
        this.A03 = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat A00(java.lang.Object r14) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.A00(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.A07);
        sb.append(", ");
        sb.append((Object) this.A06);
        sb.append(", ");
        sb.append((Object) this.A05);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Uri uri;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            parcel.writeString(this.A08);
            TextUtils.writeToParcel(this.A07, parcel, i);
            TextUtils.writeToParcel(this.A06, parcel, i);
            TextUtils.writeToParcel(this.A05, parcel, i);
            parcel.writeParcelable(this.A01, i);
            parcel.writeParcelable(this.A02, i);
            parcel.writeBundle(this.A04);
            parcel.writeParcelable(this.A03, i);
            return;
        }
        Object obj = this.A00;
        if (obj == null && i2 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.A08);
            builder.setTitle(this.A07);
            builder.setSubtitle(this.A06);
            builder.setDescription(this.A05);
            builder.setIconBitmap(this.A01);
            builder.setIconUri(this.A02);
            Bundle bundle = this.A04;
            if (i2 < 23 && (uri = this.A03) != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.A03);
            }
            obj = builder.build();
            this.A00 = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
