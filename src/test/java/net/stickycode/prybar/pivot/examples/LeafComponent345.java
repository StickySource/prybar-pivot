package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent345
    implements PrybarComponent {

  private RootComponent345 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent345.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent345.class, "root"));
  }

  public RootComponent345 getRoot() {
    return root;
  }

}
