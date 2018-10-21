package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent499
    implements PrybarComponent {

  private RootComponent499 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent499.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent499.class, "root"));
  }

  public RootComponent499 getRoot() {
    return root;
  }

}
