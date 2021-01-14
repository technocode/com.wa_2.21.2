package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1H6  reason: invalid class name */
public final class AnonymousClass1H6 implements Closeable {
    public int A00 = 1;
    public int A01 = 1;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05;
    public AnonymousClass1H8 A06;
    public String A07;
    public boolean A08 = false;
    public final AnonymousClass1H9 A09 = new AnonymousClass1H9();
    public final Reader A0A;
    public final List A0B;
    public final char[] A0C = new char[1024];

    public AnonymousClass1H6(Reader reader) {
        ArrayList arrayList = new ArrayList();
        this.A0B = arrayList;
        arrayList.add(AnonymousClass1H7.EMPTY_DOCUMENT);
        this.A0A = reader;
    }

    public double A00() {
        A03();
        AnonymousClass1H8 r1 = this.A06;
        if (r1 == AnonymousClass1H8.STRING || r1 == AnonymousClass1H8.NUMBER) {
            double parseDouble = Double.parseDouble(this.A07);
            A07();
            return parseDouble;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Expected a double but was ");
        A0S.append(r1);
        throw new IllegalStateException(A0S.toString());
    }

    public int A01() {
        int i;
        A03();
        AnonymousClass1H8 r1 = this.A06;
        if (r1 == AnonymousClass1H8.STRING || r1 == AnonymousClass1H8.NUMBER) {
            try {
                i = Integer.parseInt(this.A07);
            } catch (NumberFormatException unused) {
                String str = this.A07;
                double parseDouble = Double.parseDouble(str);
                i = (int) parseDouble;
                if (((double) i) != parseDouble) {
                    throw new NumberFormatException(str);
                }
            }
            A07();
            return i;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Expected an int but was ");
        A0S.append(r1);
        throw new IllegalStateException(A0S.toString());
    }

    public final int A02() {
        while (true) {
            if (this.A03 < this.A02 || A0C(1)) {
                char[] cArr = this.A0C;
                int i = this.A03;
                int i2 = i + 1;
                this.A03 = i2;
                char c = cArr[i];
                if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                    if (c == '#') {
                        A08();
                        A09();
                    } else if (c != '/') {
                        return c;
                    } else {
                        if (i2 == this.A02 && !A0C(1)) {
                            return c;
                        }
                        A08();
                        int i3 = this.A03;
                        char c2 = cArr[i3];
                        if (c2 == '*') {
                            int i4 = i3 + 1;
                            this.A03 = i4;
                            while (true) {
                                int i5 = 0;
                                if (i4 + 2 <= this.A02 || A0C(2)) {
                                    while (cArr[this.A03 + i5] == "*/".charAt(i5)) {
                                        i5++;
                                        if (i5 >= 2) {
                                            this.A03 += 2;
                                            break;
                                        }
                                    }
                                    i4 = this.A03 + 1;
                                    this.A03 = i4;
                                } else {
                                    A0B("Unterminated comment");
                                    throw null;
                                }
                            }
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.A03 = i3 + 1;
                            A09();
                        }
                    }
                }
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public AnonymousClass1H8 A03() {
        AnonymousClass1H8 r1;
        AnonymousClass1H8 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        List list = this.A0B;
        int ordinal = ((AnonymousClass1H7) list.get(list.size() - 1)).ordinal();
        if (ordinal == 0) {
            return A05(true);
        }
        if (ordinal == 1) {
            return A05(false);
        }
        if (ordinal == 3) {
            list.set(list.size() - 1, AnonymousClass1H7.NONEMPTY_DOCUMENT);
            AnonymousClass1H8 A042 = A04();
            if (this.A08 || (r1 = this.A06) == AnonymousClass1H8.BEGIN_ARRAY) {
                return A042;
            }
            StringBuilder A0S = AnonymousClass008.A0S("Expected S-Expression document to start with '(' but was ");
            A0S.append(r1);
            throw new IOException(A0S.toString());
        } else if (ordinal == 4) {
            try {
                AnonymousClass1H8 A043 = A04();
                if (this.A08) {
                    return A043;
                }
                A0B("Expected EOF");
                throw null;
            } catch (EOFException unused) {
                AnonymousClass1H8 r02 = AnonymousClass1H8.END_DOCUMENT;
                this.A06 = r02;
                return r02;
            }
        } else if (ordinal != 5) {
            throw new AssertionError();
        } else {
            throw new IllegalStateException("SExpReader is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        if (r1 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0082, code lost:
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        r1.append(r3, r2, r4);
        r18.A04 += r4;
        r18.A03 += r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        A08();
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1H8 A04() {
        /*
        // Method dump skipped, instructions count: 688
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H6.A04():X.1H8");
    }

    public final AnonymousClass1H8 A05(boolean z) {
        AnonymousClass1H8 r4 = AnonymousClass1H8.END_ARRAY;
        if (z) {
            AnonymousClass1H7 r2 = AnonymousClass1H7.NONEMPTY_ARRAY;
            List list = this.A0B;
            list.set(list.size() - 1, r2);
        } else {
            int A022 = A02();
            if (A022 == 41) {
                List list2 = this.A0B;
                list2.remove(list2.size() - 1);
                this.A06 = r4;
                return r4;
            } else if (A022 != 44) {
                if (A022 == 59) {
                    A08();
                } else {
                    A0B("Unterminated array");
                    throw null;
                }
            }
        }
        int A023 = A02();
        if (A023 != 41) {
            if (!(A023 == 44 || A023 == 59)) {
                this.A03--;
                return A04();
            }
        } else if (z) {
            List list3 = this.A0B;
            list3.remove(list3.size() - 1);
            this.A06 = r4;
            return r4;
        }
        A08();
        this.A03--;
        this.A07 = "null";
        AnonymousClass1H8 r0 = AnonymousClass1H8.NULL;
        this.A06 = r0;
        return r0;
    }

    public String A06() {
        A03();
        AnonymousClass1H8 r1 = this.A06;
        if (r1 == AnonymousClass1H8.STRING || r1 == AnonymousClass1H8.NUMBER) {
            String str = this.A07;
            A07();
            return str;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Expected a string but was ");
        A0S.append(A03());
        throw new IllegalStateException(A0S.toString());
    }

    public final void A07() {
        A03();
        this.A06 = null;
        this.A07 = null;
    }

    public final void A08() {
        if (!this.A08) {
            A0B("Use SExpReader.setLenient(true) to accept malformed S-Expression");
            throw null;
        }
    }

    public final void A09() {
        char c;
        do {
            if (this.A03 < this.A02 || A0C(1)) {
                char[] cArr = this.A0C;
                int i = this.A03;
                this.A03 = i + 1;
                c = cArr[i];
                if (c == '\r') {
                    return;
                }
            } else {
                return;
            }
        } while (c != '\n');
    }

    public final void A0A(AnonymousClass1H8 r3) {
        A03();
        if (this.A06 == r3) {
            A07();
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(r3);
        sb.append(" but was ");
        sb.append(A03());
        throw new IllegalStateException(sb.toString());
    }

    public final void A0B(String str) {
        int i;
        StringBuilder A0Y = AnonymousClass008.A0Y(str, " at line ");
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            i = this.A03;
            if (i3 >= i) {
                break;
            }
            if (this.A0C[i3] == '\n') {
                i2++;
            }
            i3++;
        }
        A0Y.append(i2);
        A0Y.append(" column ");
        int i4 = this.A00;
        for (int i5 = 0; i5 < i; i5++) {
            i4++;
            if (this.A0C[i5] == '\n') {
                i4 = 1;
            }
        }
        A0Y.append(i4);
        throw new IOException(A0Y.toString());
    }

    public final boolean A0C(int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            i2 = this.A03;
            if (i4 >= i2) {
                break;
            }
            if (this.A0C[i4] == '\n') {
                this.A01++;
                this.A00 = 1;
            } else {
                this.A00++;
            }
            i4++;
        }
        int i5 = this.A02;
        if (i5 != i2) {
            int i6 = i5 - i2;
            this.A02 = i6;
            char[] cArr = this.A0C;
            System.arraycopy(cArr, i2, cArr, 0, i6);
        } else {
            this.A02 = 0;
        }
        this.A03 = 0;
        do {
            Reader reader = this.A0A;
            char[] cArr2 = this.A0C;
            int i7 = this.A02;
            int read = reader.read(cArr2, i7, cArr2.length - i7);
            if (read == -1) {
                return false;
            }
            i3 = this.A02 + read;
            this.A02 = i3;
            if (this.A01 == 1 && this.A00 == 1 && i3 > 0 && cArr2[0] == 65279) {
                this.A03++;
                this.A00 = 0;
                continue;
            }
        } while (i3 < i);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A07 = null;
        this.A06 = null;
        List list = this.A0B;
        list.clear();
        list.add(AnonymousClass1H7.CLOSED);
        this.A0A.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SExpReader");
        sb.append(" near ");
        StringBuilder sb2 = new StringBuilder();
        int i = this.A03;
        int min = Math.min(i, 20);
        char[] cArr = this.A0C;
        sb2.append(cArr, i - min, min);
        int i2 = this.A02;
        int i3 = this.A03;
        sb2.append(cArr, i3, Math.min(i2 - i3, 20));
        sb.append((Object) sb2);
        return sb.toString();
    }
}
