package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.07v  reason: invalid class name and case insensitive filesystem */
public class C013807v extends AbstractC013907w {
    public int A00 = 0;
    public C014007x A01 = new C014007x();
    public EnumC014207z A02;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;
    public boolean A05 = false;
    public final WeakReference A06;

    public C013807v(AbstractC005102k r2) {
        this.A06 = new WeakReference(r2);
        this.A02 = EnumC014207z.INITIALIZED;
    }

    public static AnonymousClass082 A00(EnumC014207z r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return AnonymousClass082.ON_CREATE;
        }
        if (ordinal == 2) {
            return AnonymousClass082.ON_START;
        }
        if (ordinal == 3) {
            return AnonymousClass082.ON_RESUME;
        }
        if (ordinal != 4) {
            StringBuilder sb = new StringBuilder("Unexpected state value ");
            sb.append(r2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException();
    }

    public static EnumC014207z A01(AnonymousClass082 r2) {
        int ordinal = r2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return EnumC014207z.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return EnumC014207z.DESTROYED;
                        }
                        StringBuilder sb = new StringBuilder("Unexpected event value ");
                        sb.append(r2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            return EnumC014207z.STARTED;
        }
        return EnumC014207z.CREATED;
    }

    public final EnumC014207z A02(AnonymousClass0SL r5) {
        EnumC014207z r3;
        AnonymousClass0SN r0;
        C014007x r1 = this.A01;
        EnumC014207z r2 = null;
        if (!r1.A00.containsKey(r5) || (r0 = ((AnonymousClass0SN) r1.A00.get(r5)).A01) == null) {
            r3 = null;
        } else {
            r3 = ((AnonymousClass0SM) r0.getValue()).A00;
        }
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            r2 = (EnumC014207z) arrayList.get(arrayList.size() - 1);
        }
        EnumC014207z r12 = this.A02;
        if (r3 != null && r3.compareTo((Enum) r12) < 0) {
            r12 = r3;
        }
        if (r2 == null || r2.compareTo((Enum) r12) >= 0) {
            return r12;
        }
        return r2;
    }

    public final void A03() {
        EnumC014207z r2;
        EnumC014207z r1;
        AnonymousClass082 r22;
        AbstractC005102k r5 = (AbstractC005102k) this.A06.get();
        if (r5 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C014007x r12 = this.A01;
            if (((C014107y) r12).A00 != 0 && ((r2 = ((AnonymousClass0SM) r12.A02.A03).A00) != (r1 = ((AnonymousClass0SM) r12.A01.A03).A00) || this.A02 != r1)) {
                this.A05 = false;
                if (this.A02.compareTo((Enum) r2) < 0) {
                    C014007x r23 = this.A01;
                    AnonymousClass23W r6 = new AnonymousClass23W(r23.A01, r23.A02);
                    r23.A03.put(r6, Boolean.FALSE);
                    while (r6.hasNext() && !this.A05) {
                        Map.Entry entry = (Map.Entry) r6.next();
                        AnonymousClass0SM r3 = (AnonymousClass0SM) entry.getValue();
                        while (r3.A00.compareTo((Enum) this.A02) > 0 && !this.A05) {
                            if (!this.A01.A00.containsKey(entry.getKey())) {
                                continue;
                                break;
                            }
                            EnumC014207z r24 = r3.A00;
                            int ordinal = r24.ordinal();
                            if (ordinal == 0) {
                                throw new IllegalArgumentException();
                            } else if (ordinal != 1) {
                                if (ordinal == 2) {
                                    r22 = AnonymousClass082.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    r22 = AnonymousClass082.ON_STOP;
                                } else if (ordinal == 4) {
                                    r22 = AnonymousClass082.ON_PAUSE;
                                } else {
                                    StringBuilder sb = new StringBuilder("Unexpected state value ");
                                    sb.append(r24);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                this.A03.add(A01(r22));
                                r3.A00(r5, r22);
                                ArrayList arrayList = this.A03;
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
                AnonymousClass0SN r25 = this.A01.A01;
                if (!this.A05 && r25 != null && this.A02.compareTo((Enum) ((AnonymousClass0SM) r25.A03).A00) > 0) {
                    C014007x r0 = this.A01;
                    C07130Wa r4 = new C07130Wa(r0);
                    r0.A03.put(r4, Boolean.FALSE);
                    while (r4.hasNext() && !this.A05) {
                        Map.Entry entry2 = (Map.Entry) r4.next();
                        AnonymousClass0SM r26 = (AnonymousClass0SM) entry2.getValue();
                        while (r26.A00.compareTo((Enum) this.A02) < 0 && !this.A05) {
                            if (!this.A01.A00.containsKey(entry2.getKey())) {
                                break;
                            }
                            EnumC014207z r13 = r26.A00;
                            this.A03.add(r13);
                            r26.A00(r5, A00(r13));
                            ArrayList arrayList2 = this.A03;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                this.A05 = false;
            }
        }
        this.A05 = false;
    }

    public void A04(AnonymousClass082 r2) {
        A05(A01(r2));
    }

    public final void A05(EnumC014207z r3) {
        if (this.A02 != r3) {
            this.A02 = r3;
            if (this.A04 || this.A00 != 0) {
                this.A05 = true;
                return;
            }
            this.A04 = true;
            A03();
            this.A04 = false;
        }
    }
}
