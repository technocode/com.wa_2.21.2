package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0rb  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17470rb {
    public final AnonymousClass05V A00;
    public final AnonymousClass05V A01;
    public final AnonymousClass05V A02;

    public AbstractC17470rb(AnonymousClass05V r1, AnonymousClass05V r2, AnonymousClass05V r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public int A00(int i, int i2) {
        if (!A09(i2)) {
            return i;
        }
        return ((C30931cE) this).A05.readInt();
    }

    public Parcelable A01(Parcelable parcelable, int i) {
        if (!A09(i)) {
            return parcelable;
        }
        return ((C30931cE) this).A05.readParcelable(C30931cE.class.getClassLoader());
    }

    public AbstractC17470rb A02() {
        C30931cE r3 = (C30931cE) this;
        Parcel parcel = r3.A05;
        int dataPosition = parcel.dataPosition();
        int i = r3.A02;
        if (i == r3.A04) {
            i = r3.A03;
        }
        return new C30931cE(parcel, dataPosition, i, AnonymousClass008.A0O(new StringBuilder(), r3.A07, "  "), ((AbstractC17470rb) r3).A01, ((AbstractC17470rb) r3).A02, ((AbstractC17470rb) r3).A00);
    }

    public AbstractC17480rc A03() {
        String readString = ((C30931cE) this).A05.readString();
        if (readString == null) {
            return null;
        }
        AbstractC17470rb A022 = A02();
        try {
            AnonymousClass05V r3 = this.A01;
            Method method = (Method) r3.getOrDefault(readString, null);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(readString, true, AbstractC17470rb.class.getClassLoader()).getDeclaredMethod("read", AbstractC17470rb.class);
                r3.put(readString, method);
            }
            return (AbstractC17480rc) method.invoke(null, A022);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public final Class A04(Class cls) {
        AnonymousClass05V r5 = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) r5.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        r5.put(name, cls3);
        return cls3;
    }

    public void A05() {
        C30931cE r2 = (C30931cE) this;
        int i = r2.A00;
        if (i >= 0) {
            int i2 = r2.A06.get(i);
            Parcel parcel = r2.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(dataPosition - i2);
            parcel.setDataPosition(dataPosition);
        }
    }

    public void A06(int i) {
        C30931cE r0 = (C30931cE) this;
        r0.A05();
        r0.A00 = i;
        SparseIntArray sparseIntArray = r0.A06;
        Parcel parcel = r0.A05;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public void A07(int i, int i2) {
        A06(i2);
        ((C30931cE) this).A05.writeInt(i);
    }

    public void A08(AbstractC17480rc r10) {
        if (r10 == null) {
            ((C30931cE) this).A05.writeString(null);
            return;
        }
        try {
            Class<?> cls = r10.getClass();
            ((C30931cE) this).A05.writeString(A04(cls).getName());
            AbstractC17470rb A022 = A02();
            try {
                AnonymousClass05V r6 = this.A02;
                String name = cls.getName();
                Method method = (Method) r6.getOrDefault(name, null);
                if (method == null) {
                    Class A04 = A04(cls);
                    System.currentTimeMillis();
                    method = A04.getDeclaredMethod("write", cls, AbstractC17470rb.class);
                    r6.put(name, method);
                }
                method.invoke(null, r10, A022);
                A022.A05();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw e2.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(r10.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public boolean A09(int i) {
        C30931cE r4 = (C30931cE) this;
        while (true) {
            int i2 = r4.A02;
            if (i2 < r4.A03) {
                int i3 = r4.A01;
                if (i3 == i) {
                    break;
                } else if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                    return false;
                } else {
                    Parcel parcel = r4.A05;
                    parcel.setDataPosition(i2);
                    int readInt = parcel.readInt();
                    r4.A01 = parcel.readInt();
                    r4.A02 += readInt;
                }
            } else if (r4.A01 != i) {
                return false;
            }
        }
        return true;
    }
}
