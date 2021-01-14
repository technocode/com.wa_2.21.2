package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1FE  reason: invalid class name */
public class AnonymousClass1FE implements Externalizable {
    public static final long serialVersionUID = 1;
    public List metadata_ = new ArrayList();

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C12530iF r1 = new C12530iF();
            r1.readExternal(objectInput);
            this.metadata_.add(r1);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int size = this.metadata_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C12530iF) this.metadata_.get(i)).writeExternal(objectOutput);
        }
    }
}
