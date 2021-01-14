package X;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* renamed from: X.0mg  reason: invalid class name and case insensitive filesystem */
public class C14670mg {
    public int A00;
    public ComponentName A01;
    public Context A02;
    public IconCompat A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public String A07;
    public Set A08;
    public boolean A09;
    public boolean A0A;
    public Intent[] A0B;
    public C14610mZ[] A0C;

    public ShortcutInfo A00() {
        int length;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.A02, this.A07).setShortLabel(this.A05).setIntents(this.A0B);
        IconCompat iconCompat = this.A03;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.A07());
        }
        if (!TextUtils.isEmpty(this.A06)) {
            intents.setLongLabel(this.A06);
        }
        if (!TextUtils.isEmpty(this.A04)) {
            intents.setDisabledMessage(this.A04);
        }
        ComponentName componentName = this.A01;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.A08;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.A00);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            C14610mZ[] r0 = this.A0C;
            if (r0 != null && (length2 = r0.length) > 0) {
                Person[] personArr = new Person[length2];
                while (i < length2) {
                    personArr[i] = this.A0C[i].A00();
                    i++;
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.A0A);
        } else {
            PersistableBundle persistableBundle = new PersistableBundle();
            C14610mZ[] r02 = this.A0C;
            if (r02 != null && (length = r02.length) > 0) {
                persistableBundle.putInt("extraPersonCount", length);
                while (true) {
                    C14610mZ[] r1 = this.A0C;
                    if (i >= r1.length) {
                        break;
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("extraPerson_");
                    int i2 = i + 1;
                    A0S.append(i2);
                    String obj = A0S.toString();
                    C14610mZ r7 = r1[i];
                    String str = null;
                    if (r7 != null) {
                        PersistableBundle persistableBundle2 = new PersistableBundle();
                        CharSequence charSequence = r7.A01;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        }
                        persistableBundle2.putString("name", str);
                        persistableBundle2.putString("uri", r7.A03);
                        persistableBundle2.putString("key", r7.A02);
                        persistableBundle2.putBoolean("isBot", r7.A04);
                        persistableBundle2.putBoolean("isImportant", r7.A05);
                        persistableBundle.putPersistableBundle(obj, persistableBundle2);
                        i = i2;
                    } else {
                        throw null;
                    }
                }
            }
            persistableBundle.putBoolean("extraLongLived", this.A0A);
            intents.setExtras(persistableBundle);
        }
        return intents.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r4 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r4 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Intent r8) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14670mg.A01(android.content.Intent):void");
    }
}
