package X;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0mZ  reason: invalid class name and case insensitive filesystem */
public class C14610mZ {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public C14610mZ(C14600mY r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
    }

    public Person A00() {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(this.A01);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            icon = iconCompat.A07();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(this.A03).setKey(this.A02).setBot(this.A04).setImportant(this.A05).build();
    }

    public Bundle A01() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.A01);
        IconCompat iconCompat = this.A00;
        Bundle bundle2 = null;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            int i = iconCompat.A02;
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            bundle2.putByteArray("obj", (byte[]) iconCompat.A06);
                        } else if (i != 4) {
                            if (i != 5) {
                                throw new IllegalArgumentException("Invalid icon");
                            }
                        }
                    }
                    bundle2.putString("obj", (String) iconCompat.A06);
                }
                bundle2.putParcelable("obj", (Bitmap) iconCompat.A06);
            } else {
                bundle2.putParcelable("obj", (Parcelable) iconCompat.A06);
            }
            bundle2.putInt("type", iconCompat.A02);
            bundle2.putInt("int1", iconCompat.A00);
            bundle2.putInt("int2", iconCompat.A01);
            ColorStateList colorStateList = iconCompat.A03;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.A04;
            if (mode != IconCompat.A09) {
                bundle2.putString("tint_mode", mode.name());
            }
        }
        bundle.putBundle("icon", bundle2);
        bundle.putString("uri", this.A03);
        bundle.putString("key", this.A02);
        bundle.putBoolean("isBot", this.A04);
        bundle.putBoolean("isImportant", this.A05);
        return bundle;
    }
}
