package X;

import android.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.25c  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC455125c implements AbstractC34251i9 {
    public long A00;
    public long A01;
    public C461928o A02;
    public final ArrayDeque A03 = new ArrayDeque();
    public final ArrayDeque A04;
    public final PriorityQueue A05;

    @Override // X.AbstractC227312y
    public void release() {
    }

    public AbstractC455125c() {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new C461928o(null));
        }
        this.A04 = new ArrayDeque();
        do {
            this.A04.add(new C462028p(this));
            i++;
        } while (i < 2);
        this.A05 = new PriorityQueue();
    }

    @Override // X.AbstractC227312y
    public Object A3b() {
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        C002001d.A3A(z);
        ArrayDeque arrayDeque = this.A03;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C461928o r0 = (C461928o) arrayDeque.pollFirst();
        this.A02 = r0;
        return r0;
    }

    @Override // X.AbstractC227312y
    public Object A3c() {
        boolean z;
        C34281iC r2;
        AnonymousClass14M r4;
        byte A012;
        int i;
        ArrayDeque arrayDeque = this.A04;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue priorityQueue = this.A05;
                if (!priorityQueue.isEmpty() && ((C33961hf) priorityQueue.peek()).A00 <= this.A00) {
                    C454925a r0 = (C454925a) priorityQueue.poll();
                    if (r0.A01()) {
                        AbstractC227012v r13 = (AbstractC227012v) arrayDeque.pollFirst();
                        r13.A00 = 4 | r13.A00;
                        r0.A03();
                        this.A03.add(r0);
                        return r13;
                    }
                    if (!(this instanceof AnonymousClass28n)) {
                        AnonymousClass28m r12 = (AnonymousClass28m) this;
                        C233815n r11 = r12.A0A;
                        byte[] array = r0.A01.array();
                        int limit = r0.A01.limit();
                        r11.A02 = array;
                        r11.A00 = limit;
                        r11.A01 = 0;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            int i2 = r11.A00 - r11.A01;
                            int i3 = r12.A08;
                            if (i2 >= i3) {
                                if (i3 == 2) {
                                    A012 = -4;
                                } else {
                                    A012 = (byte) r11.A01();
                                }
                                byte A013 = (byte) (r11.A01() & 127);
                                byte A014 = (byte) (r11.A01() & 127);
                                if ((A012 & 6) == 4 && (((i = r12.A09) != 1 || (A012 & 1) == 0) && ((i != 2 || (A012 & 1) == 1) && !(A013 == 0 && A014 == 0)))) {
                                    int i4 = A013 & 247;
                                    if (i4 == 17 && (A014 & 240) == 48) {
                                        r12.A04.A05.append((char) AnonymousClass28m.A0F[A014 & 15]);
                                    } else if ((A013 & 246) == 18 && (A014 & 224) == 32) {
                                        r12.A04.A01();
                                        if ((A013 & 1) == 0) {
                                            r12.A04.A05.append((char) AnonymousClass28m.A0G[A014 & 31]);
                                        } else {
                                            r12.A04.A05.append((char) AnonymousClass28m.A0H[A014 & 31]);
                                        }
                                    } else if ((A013 & 224) == 0) {
                                        int i5 = A013 & 240;
                                        z3 = false;
                                        if (i5 == 16) {
                                            z3 = true;
                                            if (r12.A07 && r12.A00 == A013 && r12.A01 == A014) {
                                                r12.A07 = false;
                                            } else {
                                                r12.A07 = true;
                                                r12.A00 = A013;
                                                r12.A01 = A014;
                                            }
                                        }
                                        if (i4 == 17 && (A014 & 240) == 32) {
                                            AnonymousClass14K r22 = r12.A04;
                                            StringBuilder sb = r22.A05;
                                            sb.append(' ');
                                            boolean z4 = false;
                                            if ((A014 & 1) == 1) {
                                                z4 = true;
                                            }
                                            r22.A06.add(new AnonymousClass14J((A014 >> 1) & 7, z4, sb.length()));
                                        } else if (i5 == 16 && (A014 & 192) == 64) {
                                            int i6 = AnonymousClass28m.A0E[A013 & 7];
                                            if ((A014 & 32) != 0) {
                                                i6++;
                                            }
                                            AnonymousClass14K r8 = r12.A04;
                                            if (i6 != r8.A03) {
                                                if (r12.A02 != 1 && (!r8.A06.isEmpty() || !r8.A07.isEmpty() || r8.A05.length() != 0)) {
                                                    AnonymousClass14K r23 = new AnonymousClass14K(r12.A02, r12.A03);
                                                    r12.A04 = r23;
                                                    r12.A0B.add(r23);
                                                }
                                                r8 = r12.A04;
                                                r8.A03 = i6;
                                            }
                                            boolean z5 = false;
                                            if ((A014 & 16) == 16) {
                                                z5 = true;
                                            }
                                            boolean z6 = false;
                                            if ((A014 & 1) == 1) {
                                                z6 = true;
                                            }
                                            int i7 = (A014 >> 1) & 7;
                                            int i8 = i7;
                                            if (z5) {
                                                i8 = 8;
                                            }
                                            r8.A06.add(new AnonymousClass14J(i8, z6, r8.A05.length()));
                                            if (z5) {
                                                r12.A04.A02 = AnonymousClass28m.A0D[i7];
                                            }
                                        } else if (i4 == 23) {
                                            if (A014 >= 33 && A014 <= 35) {
                                                r12.A04.A04 = A014 - 32;
                                            }
                                        } else if (i4 == 20 && (A014 & 240) == 32) {
                                            if (A014 == 32) {
                                                r12.A02(2);
                                            } else if (A014 != 41) {
                                                switch (A014) {
                                                    case 37:
                                                        r12.A02(1);
                                                        r12.A03 = 2;
                                                        r12.A04.A01 = 2;
                                                        break;
                                                    case 38:
                                                        r12.A02(1);
                                                        r12.A03 = 3;
                                                        r12.A04.A01 = 3;
                                                        break;
                                                    case 39:
                                                        r12.A02(1);
                                                        r12.A03 = 4;
                                                        r12.A04.A01 = 4;
                                                        break;
                                                    default:
                                                        int i9 = r12.A02;
                                                        if (i9 != 0) {
                                                            if (A014 == 33) {
                                                                r12.A04.A01();
                                                                break;
                                                            } else {
                                                                switch (A014) {
                                                                    case 44:
                                                                        r12.A05 = Collections.emptyList();
                                                                        int i10 = r12.A02;
                                                                        if (i10 == 1 || i10 == 3) {
                                                                            r12.A01();
                                                                            break;
                                                                        }
                                                                    case 45:
                                                                        if (i9 == 1) {
                                                                            AnonymousClass14K r1 = r12.A04;
                                                                            if (!r1.A06.isEmpty() || !r1.A07.isEmpty() || r1.A05.length() != 0) {
                                                                                AnonymousClass14K r3 = r12.A04;
                                                                                r3.A07.add(r3.A00());
                                                                                r3.A05.setLength(0);
                                                                                r3.A06.clear();
                                                                                int min = Math.min(r3.A01, r3.A03);
                                                                                while (true) {
                                                                                    List list = r3.A07;
                                                                                    if (list.size() < min) {
                                                                                        break;
                                                                                    } else {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                                                                        r12.A01();
                                                                        break;
                                                                    case 47:
                                                                        r12.A05 = r12.A00();
                                                                        r12.A01();
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            } else {
                                                r12.A02(3);
                                            }
                                        }
                                    } else {
                                        AnonymousClass14K r14 = r12.A04;
                                        int[] iArr = AnonymousClass28m.A0C;
                                        StringBuilder sb2 = r14.A05;
                                        sb2.append((char) iArr[(A013 & Byte.MAX_VALUE) - 32]);
                                        if ((A014 & 224) != 0) {
                                            sb2.append((char) iArr[(A014 & Byte.MAX_VALUE) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            } else if (z2) {
                                if (!z3) {
                                    r12.A07 = false;
                                }
                                int i11 = r12.A02;
                                if (i11 == 1 || i11 == 3) {
                                    r12.A05 = r12.A00();
                                }
                            }
                        }
                    } else {
                        AnonymousClass28n r122 = (AnonymousClass28n) this;
                        byte[] array2 = r0.A01.array();
                        C233815n r32 = r122.A07;
                        int limit2 = r0.A01.limit();
                        r32.A02 = array2;
                        r32.A00 = limit2;
                        r32.A01 = 0;
                        while (r32.A00 - r32.A01 >= 3) {
                            int A015 = r32.A01() & 7;
                            int i12 = A015 & 3;
                            boolean z7 = false;
                            boolean z8 = false;
                            if ((A015 & 4) == 4) {
                                z8 = true;
                            }
                            byte A016 = (byte) r32.A01();
                            byte A017 = (byte) r32.A01();
                            if ((i12 == 2 || i12 == 3) && z8) {
                                if (i12 == 3) {
                                    r122.A01();
                                    int i13 = (A016 & 192) >> 6;
                                    int i14 = A016 & 63;
                                    if (i14 == 0) {
                                        i14 = 64;
                                    }
                                    r4 = new AnonymousClass14M(i13, i14);
                                    r122.A02 = r4;
                                    byte[] bArr = r4.A03;
                                    int i15 = r4.A00;
                                    r4.A00 = i15 + 1;
                                    bArr[i15] = A017;
                                } else {
                                    if (i12 == 2) {
                                        z7 = true;
                                    }
                                    C002001d.A39(z7);
                                    r4 = r122.A02;
                                    if (r4 == null) {
                                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                                    } else {
                                        byte[] bArr2 = r4.A03;
                                        int i16 = r4.A00;
                                        int i17 = i16 + 1;
                                        r4.A00 = i17;
                                        bArr2[i16] = A016;
                                        r4.A00 = i17 + 1;
                                        bArr2[i17] = A017;
                                    }
                                }
                                if (r4.A00 == (r4.A01 << 1) - 1) {
                                    r122.A01();
                                }
                            }
                        }
                    }
                    if (!(this instanceof AnonymousClass28n)) {
                        AnonymousClass28m r24 = (AnonymousClass28m) this;
                        List list2 = r24.A05;
                        List list3 = r24.A06;
                        z = false;
                        if (list2 != list3) {
                            z = true;
                        }
                    } else {
                        AnonymousClass28n r25 = (AnonymousClass28n) this;
                        List list4 = r25.A03;
                        List list5 = r25.A04;
                        z = false;
                        if (list4 != list5) {
                            z = true;
                        }
                    }
                    if (z) {
                        if (!(this instanceof AnonymousClass28n)) {
                            AnonymousClass28m r15 = (AnonymousClass28m) this;
                            List list6 = r15.A05;
                            r15.A06 = list6;
                            r2 = new C34281iC(list6);
                        } else {
                            AnonymousClass28n r16 = (AnonymousClass28n) this;
                            List list7 = r16.A03;
                            r16.A04 = list7;
                            r2 = new C34281iC(list7);
                        }
                        if (!r0.A00()) {
                            AbstractC455025b r132 = (AbstractC455025b) arrayDeque.pollFirst();
                            long j = ((C33961hf) r0).A00;
                            ((AbstractC33971hg) r132).A00 = j;
                            r132.A01 = r2;
                            r132.A00 = j;
                            r0.A03();
                            this.A03.add(r0);
                            return r132;
                        }
                    }
                    r0.A03();
                    this.A03.add(r0);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC227312y
    public void AMI(Object obj) {
        AbstractC227012v r6 = (AbstractC227012v) obj;
        boolean z = false;
        if (r6 == this.A02) {
            z = true;
        }
        C002001d.A39(z);
        if (r6.A00()) {
            C461928o r1 = this.A02;
            r1.A03();
            this.A03.add(r1);
        } else {
            C461928o r4 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            r4.A00 = j;
            this.A05.add(r4);
        }
        this.A02 = null;
    }

    @Override // X.AbstractC34251i9
    public void AOs(long j) {
        this.A00 = j;
    }

    @Override // X.AbstractC227312y
    public void flush() {
        this.A01 = 0;
        this.A00 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (priorityQueue.isEmpty()) {
                break;
            }
            C33961hf r1 = (C33961hf) priorityQueue.poll();
            r1.A03();
            this.A03.add(r1);
        }
        C461928o r12 = this.A02;
        if (r12 != null) {
            r12.A03();
            this.A03.add(r12);
            this.A02 = null;
        }
    }
}
