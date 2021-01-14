package X;

import com.whatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.0Pv  reason: invalid class name and case insensitive filesystem */
public class C05730Pv extends ObjectInputStream {
    public C05730Pv(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        return readClassDescriptor.getName().equals("com.whatsapp.App$Me") ? ObjectStreamClass.lookup(Me.class) : readClassDescriptor;
    }
}
