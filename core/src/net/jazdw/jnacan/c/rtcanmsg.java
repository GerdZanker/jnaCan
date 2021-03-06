package net.jazdw.jnacan.c;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : can/gw.h:2</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class rtcanmsg extends Structure {
	/** C type : __u8 */
	public byte can_family;
	/** C type : __u8 */
	public byte gwtype;
	/** C type : __u16 */
	public short flags;
	public rtcanmsg() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("can_family", "gwtype", "flags");
	}
	/**
	 * @param can_family C type : __u8<br>
	 * @param gwtype C type : __u8<br>
	 * @param flags C type : __u16
	 */
	public rtcanmsg(byte can_family, byte gwtype, short flags) {
		super();
		this.can_family = can_family;
		this.gwtype = gwtype;
		this.flags = flags;
	}
	public static class ByReference extends rtcanmsg implements Structure.ByReference {
		
	};
	public static class ByValue extends rtcanmsg implements Structure.ByValue {
		
	};
}
