package X;

import java.util.LinkedList;

/* renamed from: X.0LM  reason: invalid class name */
public class AnonymousClass0LM extends LinkedList<byte[]> {
    public int byteSize = 0;

    public void A00(byte[] bArr) {
        super.addFirst(bArr);
        int length = bArr.length + 1 + this.byteSize;
        this.byteSize = length;
        while (((long) length) > 256) {
            length = this.byteSize - (((byte[]) super.removeLast()).length + 1);
            this.byteSize = length;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.Queue, java.util.LinkedList, java.util.Deque
    public /* bridge */ /* synthetic */ boolean add(byte[] bArr) {
        A00(bArr);
        return true;
    }
}
