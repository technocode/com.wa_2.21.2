package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0T8  reason: invalid class name */
public class AnonymousClass0T8 implements AnonymousClass0T9 {
    public static final int[] A0O = {1, 4, 5, 3, 2, 0};
    public int A00 = 0;
    public Drawable A01;
    public View A02;
    public AnonymousClass0MX A03;
    public AnonymousClass1ZT A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A;
    public CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = false;
    public final Context A0M;
    public final Resources A0N;

    public AnonymousClass0T8(Context context) {
        boolean z = false;
        this.A0M = context;
        Resources resources = context.getResources();
        this.A0N = resources;
        this.A07 = new ArrayList();
        this.A0A = new ArrayList();
        this.A0F = true;
        this.A06 = new ArrayList();
        this.A08 = new ArrayList();
        this.A0D = true;
        if (resources.getConfiguration().keyboard != 1 && C14960nA.A03(ViewConfiguration.get(this.A0M), this.A0M)) {
            z = true;
        }
        this.A0K = z;
    }

    public MenuItem A00(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = A0O;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                AnonymousClass1ZT r4 = new AnonymousClass1ZT(this, i, i2, i3, i6, charSequence, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((AnonymousClass1ZT) arrayList.get(size)).A0S <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, r4);
                A0E(true);
                return r4;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public AnonymousClass0T8 A01() {
        if (!(this instanceof AnonymousClass0TY)) {
            return this;
        }
        return ((AnonymousClass0TY) this).A00.A01();
    }

    public AnonymousClass1ZT A02(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.A09;
        arrayList.clear();
        A0D(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (AnonymousClass1ZT) arrayList.get(0);
        }
        boolean A0H2 = A0H();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1ZT r2 = (AnonymousClass1ZT) arrayList.get(i2);
            if (A0H2) {
                c = r2.A00;
            } else {
                c = r2.A01;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (A0H2 && c == '\b' && i == 67))) {
                return r2;
            }
        }
        return null;
    }

    public String A03() {
        int i;
        if (!(this instanceof AnonymousClass0TY)) {
            return "android:menu:actionviewstates";
        }
        AnonymousClass1ZT r0 = ((AnonymousClass0TY) this).A01;
        if (r0 == null || (i = r0.A0R) == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("android:menu:actionviewstates");
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    public ArrayList A04() {
        if (!this.A0F) {
            return this.A0A;
        }
        this.A0A.clear();
        int size = this.A07.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass1ZT r1 = (AnonymousClass1ZT) this.A07.get(i);
            if (r1.isVisible()) {
                this.A0A.add(r1);
            }
        }
        this.A0F = false;
        this.A0D = true;
        return this.A0A;
    }

    public void A05() {
        ArrayList A042 = A04();
        if (this.A0D) {
            Iterator it = this.A0B.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass0TO r0 = (AnonymousClass0TO) reference.get();
                if (r0 == null) {
                    this.A0B.remove(reference);
                } else {
                    z |= r0.A4H();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A042.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass1ZT r2 = (AnonymousClass1ZT) A042.get(i);
                    if ((r2.A02 & 32) == 32) {
                        arrayList.add(r2);
                    } else {
                        arrayList2.add(r2);
                    }
                }
            } else {
                this.A06.clear();
                ArrayList arrayList3 = this.A08;
                arrayList3.clear();
                arrayList3.addAll(A04());
            }
            this.A0D = false;
        }
    }

    public void A06() {
        this.A0I = false;
        if (this.A0G) {
            this.A0G = false;
            A0E(this.A0L);
        }
    }

    public void A07() {
        if (!this.A0I) {
            this.A0I = true;
            this.A0G = false;
            this.A0L = false;
        }
    }

    public final void A08(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.A0N;
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            if (i > 0) {
                this.A05 = resources.getText(i);
            } else if (charSequence != null) {
                this.A05 = charSequence;
            }
            if (i2 > 0) {
                this.A01 = C004302a.A03(this.A0M, i2);
            } else if (drawable != null) {
                this.A01 = drawable;
            }
            this.A02 = null;
        }
        A0E(false);
    }

    public void A09(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(A03());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((AnonymousClass0T8) item.getSubMenu()).A09(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void A0A(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((AnonymousClass0T8) item.getSubMenu()).A0A(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A03(), sparseArray);
        }
    }

    public void A0B(AnonymousClass0TO r4) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == r4) {
                this.A0B.remove(reference);
            }
        }
    }

    public void A0C(AnonymousClass0TO r3, Context context) {
        this.A0B.add(new WeakReference(r3));
        r3.AAh(context, this);
        this.A0D = true;
    }

    public void A0D(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean A0H2 = A0H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.A07.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass1ZT r2 = (AnonymousClass1ZT) this.A07.get(i3);
                if (r2.hasSubMenu()) {
                    r2.A0F.A0D(list, i, keyEvent);
                }
                if (A0H2) {
                    c = r2.A00;
                    i2 = r2.A04;
                } else {
                    c = r2.A01;
                    i2 = r2.A05;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (A0H2 && c == '\b' && i == 67)) && r2.isEnabled()) {
                        list.add(r2);
                    }
                }
            }
        }
    }

    public void A0E(boolean z) {
        if (!this.A0I) {
            if (z) {
                this.A0F = true;
                this.A0D = true;
            }
            if (!this.A0B.isEmpty()) {
                A07();
                Iterator it = this.A0B.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    AnonymousClass0TO r0 = (AnonymousClass0TO) reference.get();
                    if (r0 == null) {
                        this.A0B.remove(reference);
                    } else {
                        r0.AQr(z);
                    }
                }
                A06();
                return;
            }
            return;
        }
        this.A0G = true;
        if (z) {
            this.A0L = true;
        }
    }

    public final void A0F(boolean z) {
        if (!this.A0E) {
            this.A0E = true;
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass0TO r0 = (AnonymousClass0TO) reference.get();
                if (r0 == null) {
                    this.A0B.remove(reference);
                } else {
                    r0.AEI(this, z);
                }
            }
            this.A0E = false;
        }
    }

    public boolean A0G() {
        if (!(this instanceof AnonymousClass0TY)) {
            return this.A0C;
        }
        return ((AnonymousClass0TY) this).A00.A0G();
    }

    public boolean A0H() {
        if (!(this instanceof AnonymousClass0TY)) {
            return this.A0J;
        }
        return ((AnonymousClass0TY) this).A00.A0H();
    }

    public boolean A0I() {
        if (!(this instanceof AnonymousClass0TY)) {
            return this.A0K;
        }
        return ((AnonymousClass0TY) this).A00.A0I();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (((X.AnonymousClass1ZU) r6).A00.hasSubMenu() == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(android.view.MenuItem r9, X.AnonymousClass0TO r10, int r11) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0T8.A0J(android.view.MenuItem, X.0TO, int):boolean");
    }

    public boolean A0K(AnonymousClass0T8 r3, MenuItem menuItem) {
        AnonymousClass0MX r0 = this.A03;
        return r0 != null && r0.AHj(r3, menuItem);
    }

    public boolean A0L(AnonymousClass1ZT r5) {
        if (this instanceof AnonymousClass0TY) {
            return ((AnonymousClass0TY) this).A00.A0L(r5);
        }
        boolean z = false;
        if (!this.A0B.isEmpty() && this.A04 == r5) {
            A07();
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass0TO r0 = (AnonymousClass0TO) reference.get();
                if (r0 == null) {
                    this.A0B.remove(reference);
                } else {
                    z = r0.A2q(this, r5);
                    if (z) {
                        break;
                    }
                }
            }
            A06();
            if (z) {
                this.A04 = null;
            }
        }
        return z;
    }

    public boolean A0M(AnonymousClass1ZT r5) {
        if (this instanceof AnonymousClass0TY) {
            return ((AnonymousClass0TY) this).A00.A0M(r5);
        }
        boolean z = false;
        if (this.A0B.isEmpty()) {
            return false;
        }
        A07();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            AnonymousClass0TO r0 = (AnonymousClass0TO) reference.get();
            if (r0 == null) {
                this.A0B.remove(reference);
            } else {
                z = r0.A4B(this, r5);
                if (z) {
                    break;
                }
            }
        }
        A06();
        if (z) {
            this.A04 = r5;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return A00(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return A00(i, i2, i3, this.A0N.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return A00(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.A0M.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            AnonymousClass1ZT r1 = (AnonymousClass1ZT) A00(i, i2, i3, resolveInfo.loadLabel(packageManager));
            r1.setIcon(resolveInfo.loadIcon(packageManager));
            r1.setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = r1;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.A0N.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        AnonymousClass1ZT r2 = (AnonymousClass1ZT) A00(i, i2, i3, charSequence);
        AnonymousClass0TY r1 = new AnonymousClass0TY(this.A0M, this, r2);
        r2.A0F = r1;
        r1.setHeaderTitle(r2.A0I);
        return r1;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clear() {
        AnonymousClass1ZT r0 = this.A04;
        if (r0 != null) {
            A0L(r0);
        }
        this.A07.clear();
        A0E(true);
    }

    public void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0E(false);
    }

    public void close() {
        A0F(true);
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1ZT r1 = (AnonymousClass1ZT) this.A07.get(i2);
            if (r1.A0R == i) {
                return r1;
            }
            if (r1.hasSubMenu() && (findItem = r1.A0F.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    public boolean hasVisibleItems() {
        if (this.A0H) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((AnonymousClass1ZT) this.A07.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return A02(i, keyEvent) != null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return A0J(findItem(i), null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        AnonymousClass1ZT A022 = A02(i, keyEvent);
        if (A022 != null) {
            z = A0J(A022, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0F(true);
        }
        return z;
    }

    public void removeGroup(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass1ZT) this.A07.get(i2)).A0Q == i) {
                if (i2 >= 0) {
                    int size2 = this.A07.size() - i2;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= size2 || ((AnonymousClass1ZT) this.A07.get(i2)).A0Q != i) {
                            A0E(true);
                        } else {
                            ArrayList arrayList = this.A07;
                            if (i2 < arrayList.size()) {
                                arrayList.remove(i2);
                            }
                            i3 = i4;
                        }
                    }
                    A0E(true);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass1ZT) this.A07.get(i2)).A0R == i) {
                if (i2 >= 0) {
                    ArrayList arrayList = this.A07;
                    if (i2 < arrayList.size()) {
                        arrayList.remove(i2);
                        A0E(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.A07.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1ZT r2 = (AnonymousClass1ZT) this.A07.get(i2);
            if (r2.A0Q == i) {
                int i3 = r2.A02 & -5;
                int i4 = 0;
                if (z2) {
                    i4 = 4;
                }
                r2.A02 = i3 | i4;
                r2.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        if (!(this instanceof AnonymousClass0TY)) {
            this.A0C = z;
        } else {
            ((AnonymousClass0TY) this).A00.setGroupDividerEnabled(z);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.A07.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1ZT r1 = (AnonymousClass1ZT) this.A07.get(i2);
            if (r1.A0Q == i) {
                r1.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1ZT r3 = (AnonymousClass1ZT) arrayList.get(i2);
            if (r3.A0Q == i) {
                int i3 = r3.A02;
                int i4 = i3 & -9;
                int i5 = 8;
                if (z) {
                    i5 = 0;
                }
                int i6 = i5 | i4;
                r3.A02 = i6;
                if (i3 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0E(true);
        }
    }

    public void setQwertyMode(boolean z) {
        if (!(this instanceof AnonymousClass0TY)) {
            this.A0J = z;
            A0E(false);
            return;
        }
        ((AnonymousClass0TY) this).A00.setQwertyMode(z);
    }

    public int size() {
        return this.A07.size();
    }
}
