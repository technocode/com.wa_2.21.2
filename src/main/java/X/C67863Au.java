package X;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.3Au  reason: invalid class name and case insensitive filesystem */
public class C67863Au extends ObjectInputStream {
    public C67863Au(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        return !readClassDescriptor.getName().startsWith("java.") ? ObjectStreamClass.lookup(C67873Av.class) : readClassDescriptor;
    }
}
