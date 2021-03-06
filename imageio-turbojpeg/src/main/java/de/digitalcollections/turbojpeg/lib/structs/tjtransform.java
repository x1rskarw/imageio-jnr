package de.digitalcollections.turbojpeg.lib.structs;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class tjtransform extends Struct {
  public tjregion r;
  public Signed32 op;
  public Signed32 options;
  public Pointer data;
  public Pointer customFilter;

  public tjtransform(Runtime runtime) {
    super(runtime);
    // NOTE: We run the initializers in the constructor since we need to access the runtime
    r = inner(new tjregion(runtime));
    op = new Signed32();
    options = new Signed32();
    data = new Pointer();
    customFilter = new Pointer();
  }
}
