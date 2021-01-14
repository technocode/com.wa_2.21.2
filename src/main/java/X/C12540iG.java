package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0iG  reason: invalid class name and case insensitive filesystem */
public class C12540iG implements Externalizable {
    public static final long serialVersionUID = 1;
    public String domesticCarrierCodeFormattingRule_ = "";
    public String format_ = "";
    public boolean hasDomesticCarrierCodeFormattingRule;
    public boolean hasFormat;
    public boolean hasNationalPrefixFormattingRule;
    public boolean hasNationalPrefixOptionalWhenFormatting;
    public boolean hasPattern;
    public List leadingDigitsPattern_ = new ArrayList();
    public String nationalPrefixFormattingRule_ = "";
    public boolean nationalPrefixOptionalWhenFormatting_ = false;
    public String pattern_ = "";

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        String readUTF = objectInput.readUTF();
        this.hasPattern = true;
        this.pattern_ = readUTF;
        String readUTF2 = objectInput.readUTF();
        this.hasFormat = true;
        this.format_ = readUTF2;
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.leadingDigitsPattern_.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = readUTF4;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = readBoolean;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        int size = this.leadingDigitsPattern_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.leadingDigitsPattern_.get(i));
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}
