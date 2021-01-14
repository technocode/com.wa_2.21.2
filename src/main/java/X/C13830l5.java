package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0l5  reason: invalid class name and case insensitive filesystem */
public final class C13830l5 implements Iterator, Map.Entry {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final /* synthetic */ AbstractC06040Rm A03;

    public C13830l5(AbstractC06040Rm r2) {
        this.A03 = r2;
        this.A00 = r2.A01() - 1;
        this.A01 = -1;
    }

    public boolean equals(Object obj) {
        if (!this.A02) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC06040Rm r3 = this.A03;
            Object A04 = r3.A04(this.A01, 0);
            if (key != A04 && (key == null || !key.equals(A04))) {
                return false;
            }
            Object value = entry.getValue();
            Object A042 = r3.A04(this.A01, 1);
            if (value == A042 || (value != null && value.equals(A042))) {
                return true;
            }
            return false;
        }
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.A02) {
            return this.A03.A04(this.A01, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.A02) {
            return this.A03.A04(this.A01, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.A01 < this.A00;
    }

    public int hashCode() {
        int hashCode;
        if (this.A02) {
            AbstractC06040Rm r4 = this.A03;
            int i = this.A01;
            int i2 = 0;
            Object A04 = r4.A04(i, 0);
            Object A042 = r4.A04(i, 1);
            if (A04 == null) {
                hashCode = 0;
            } else {
                hashCode = A04.hashCode();
            }
            if (A042 != null) {
                i2 = A042.hashCode();
            }
            return hashCode ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.A02) {
            this.A03.A06(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.A02) {
            AbstractC06040Rm r1 = this.A03;
            int i = this.A01;
            if (!(r1 instanceof C06030Rl)) {
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C29741a7) r1).A00.A02;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            }
            throw new UnsupportedOperationException("not a map");
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
