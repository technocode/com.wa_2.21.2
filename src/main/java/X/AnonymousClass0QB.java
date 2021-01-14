package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.0QB  reason: invalid class name */
public final class AnonymousClass0QB extends AnonymousClass0QC implements AnonymousClass0QD, AnonymousClass0QE {
    public int A00;
    public boolean A01;
    public final AnonymousClass0LW A02;

    public AnonymousClass0QB(AnonymousClass0LW r2) {
        AnonymousClass0SQ r0 = r2.A04;
        if (r0 != null) {
            r0.A01.getClassLoader();
        }
        this.A00 = -1;
        this.A02 = r2;
    }

    public static boolean A00(C09130cL r2) {
        AnonymousClass0O2 r0;
        AnonymousClass037 r22 = r2.A05;
        if (r22 == null || !r22.A0T || r22.A0A == null || r22.A0W || r22.A0Z || (r0 = r22.A0C) == null || !r0.A0C) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0QC
    public AnonymousClass0QC A09(AnonymousClass037 r4, EnumC014207z r5) {
        EnumC014207z r2 = EnumC014207z.CREATED;
        AnonymousClass0LW r0 = r4.A0H;
        AnonymousClass0LW r1 = this.A02;
        if (r0 != r1) {
            StringBuilder A0S = AnonymousClass008.A0S("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            A0S.append(r1);
            throw new IllegalArgumentException(A0S.toString());
        } else if (r5.compareTo((Enum) r2) >= 0) {
            super.A09(r4, r5);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Cannot set maximum Lifecycle below ");
            sb.append(r2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // X.AnonymousClass0QC
    public void A0A(int i, AnonymousClass037 r3, String str, int i2) {
        super.A0A(i, r3, str, i2);
        r3.A0H = this.A02;
    }

    public int A0B(boolean z) {
        if (!this.A01) {
            if (AnonymousClass0LW.A01(2)) {
                StringBuilder sb = new StringBuilder("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new C14830mx());
                A0E("  ", printWriter, true);
                printWriter.close();
            }
            this.A01 = true;
            if (this.A0D) {
                this.A00 = this.A02.A0T.getAndIncrement();
            } else {
                this.A00 = -1;
            }
            this.A02.A0h(this, z);
            return this.A00;
        }
        throw new IllegalStateException("commit already called");
    }

    public void A0C() {
        AnonymousClass0LW r1;
        int size = this.A0A.size();
        for (int i = 0; i < size; i++) {
            C09130cL r7 = (C09130cL) this.A0A.get(i);
            AnonymousClass037 r2 = r7.A05;
            if (r2 != null) {
                int i2 = this.A06;
                if (!(r2.A0C == null && i2 == 0)) {
                    r2.A08();
                    r2.A0C.A01 = i2;
                }
            }
            int i3 = r7.A00;
            switch (i3) {
                case 1:
                    r2.A0L(r7.A01);
                    r1 = this.A02;
                    r1.A0f(r2, false);
                    r1.A0P(r2);
                    break;
                case 2:
                default:
                    StringBuilder A0S = AnonymousClass008.A0S("Unknown cmd: ");
                    A0S.append(i3);
                    throw new IllegalArgumentException(A0S.toString());
                case 3:
                    r2.A0L(r7.A02);
                    r1 = this.A02;
                    r1.A0W(r2);
                    break;
                case 4:
                    r2.A0L(r7.A02);
                    r1 = this.A02;
                    r1.A0T(r2);
                    break;
                case 5:
                    r2.A0L(r7.A01);
                    r1 = this.A02;
                    r1.A0f(r2, false);
                    AnonymousClass0LW.A00(r2);
                    break;
                case 6:
                    r2.A0L(r7.A02);
                    r1 = this.A02;
                    r1.A0S(r2);
                    break;
                case 7:
                    r2.A0L(r7.A01);
                    r1 = this.A02;
                    r1.A0f(r2, false);
                    r1.A0R(r2);
                    break;
                case 8:
                    r1 = this.A02;
                    r1.A0Y(r2);
                    break;
                case 9:
                    r1 = this.A02;
                    r1.A0Y(null);
                    break;
                case 10:
                    r1 = this.A02;
                    r1.A0e(r2, r7.A06);
                    break;
            }
            if (!(this.A0F || r7.A00 == 1 || r2 == null)) {
                r1.A0V(r2);
            }
        }
        if (!this.A0F) {
            AnonymousClass0LW r12 = this.A02;
            r12.A0J(r12.A00, true);
        }
    }

    public void A0D(int i) {
        if (this.A0D) {
            if (AnonymousClass0LW.A01(2)) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.A0A.size();
            for (int i2 = 0; i2 < size; i2++) {
                C09130cL r2 = (C09130cL) this.A0A.get(i2);
                AnonymousClass037 r1 = r2.A05;
                if (r1 != null) {
                    r1.A01 += i;
                    if (AnonymousClass0LW.A01(2)) {
                        StringBuilder A0S = AnonymousClass008.A0S("Bump nesting of ");
                        A0S.append(r2.A05);
                        A0S.append(" to ");
                        A0S.append(r2.A05.A01);
                        Log.v("FragmentManager", A0S.toString());
                    }
                }
            }
        }
    }

    public void A0E(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A09);
            printWriter.print(" mIndex=");
            printWriter.print(this.A00);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A01);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A06));
            }
            if (!(super.A02 == 0 && this.A03 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.A02));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (!(this.A04 == 0 && this.A05 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A04));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (!(super.A01 == 0 && this.A08 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.A01));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A08);
            }
            if (!(super.A00 == 0 && this.A07 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.A00));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A07);
            }
        }
        if (!this.A0A.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.A0A.size();
            for (int i = 0; i < size; i++) {
                C09130cL r3 = (C09130cL) this.A0A.get(i);
                int i2 = r3.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder A0S = AnonymousClass008.A0S("cmd=");
                        A0S.append(i2);
                        str2 = A0S.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r3.A05);
                if (z) {
                    if (!(r3.A01 == 0 && r3.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r3.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r3.A02));
                    }
                    if (r3.A03 != 0 || r3.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r3.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r3.A04));
                    }
                }
            }
        }
    }

    public void A0F(boolean z) {
        for (int size = this.A0A.size() - 1; size >= 0; size--) {
            C09130cL r5 = (C09130cL) this.A0A.get(size);
            AnonymousClass037 r3 = r5.A05;
            if (r3 != null) {
                int i = this.A06;
                int i2 = 8194;
                if (i != 4097) {
                    if (i != 4099) {
                        i2 = 4097;
                        if (i != 8194) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 4099;
                    }
                }
                if (!(r3.A0C == null && i2 == 0)) {
                    r3.A08();
                    r3.A0C.A01 = i2;
                }
            }
            int i3 = r5.A00;
            switch (i3) {
                case 1:
                    r3.A0L(r5.A04);
                    AnonymousClass0LW r0 = this.A02;
                    r0.A0f(r3, true);
                    r0.A0W(r3);
                    break;
                case 2:
                default:
                    StringBuilder A0S = AnonymousClass008.A0S("Unknown cmd: ");
                    A0S.append(i3);
                    throw new IllegalArgumentException(A0S.toString());
                case 3:
                    r3.A0L(r5.A03);
                    this.A02.A0P(r3);
                    break;
                case 4:
                    r3.A0L(r5.A03);
                    AnonymousClass0LW.A00(r3);
                    break;
                case 5:
                    r3.A0L(r5.A04);
                    AnonymousClass0LW r02 = this.A02;
                    r02.A0f(r3, true);
                    r02.A0T(r3);
                    break;
                case 6:
                    r3.A0L(r5.A03);
                    this.A02.A0R(r3);
                    break;
                case 7:
                    r3.A0L(r5.A04);
                    AnonymousClass0LW r03 = this.A02;
                    r03.A0f(r3, true);
                    r03.A0S(r3);
                    break;
                case 8:
                    this.A02.A0Y(null);
                    break;
                case 9:
                    this.A02.A0Y(r3);
                    break;
                case 10:
                    this.A02.A0e(r3, r5.A07);
                    break;
            }
            if (!(this.A0F || r5.A00 == 3 || r3 == null)) {
                this.A02.A0V(r3);
            }
        }
        if (!this.A0F && z) {
            AnonymousClass0LW r1 = this.A02;
            r1.A0J(r1.A00, true);
        }
    }

    public boolean A0G(int i) {
        int i2;
        ArrayList arrayList = this.A0A;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass037 r0 = ((C09130cL) arrayList.get(i3)).A05;
            if (!(r0 == null || (i2 = r0.A02) == 0 || i2 != i)) {
                return true;
            }
        }
        return false;
    }

    public boolean A0H(ArrayList arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        ArrayList arrayList2 = this.A0A;
        int size = arrayList2.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            AnonymousClass037 r0 = ((C09130cL) arrayList2.get(i5)).A05;
            if (!(r0 == null || (i3 = r0.A02) == 0 || i3 == i4)) {
                for (int i6 = i; i6 < i2; i6++) {
                    AnonymousClass0QC r3 = (AnonymousClass0QC) arrayList.get(i6);
                    int size2 = r3.A0A.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        AnonymousClass037 r02 = ((C09130cL) r3.A0A.get(i7)).A05;
                        if (r02 != null && r02.A02 == i3) {
                            return true;
                        }
                    }
                }
                i4 = i3;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass0QD
    public boolean A4X(ArrayList arrayList, ArrayList arrayList2) {
        if (AnonymousClass0LW.A01(2)) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.A0D) {
            return true;
        }
        AnonymousClass0LW r1 = this.A02;
        ArrayList arrayList3 = r1.A09;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            r1.A09 = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    @Override // X.AnonymousClass0QE
    public String getName() {
        return this.A09;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A00;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A09;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }
}
