package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent6
    implements PrybarComponent {

  private RootComponent6 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent6.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent6.class, "root"));
  }

  public RootComponent6 getRoot() {
    return root;
  }

}
