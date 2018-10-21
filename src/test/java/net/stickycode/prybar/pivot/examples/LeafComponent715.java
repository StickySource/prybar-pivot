package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent715
    implements PrybarComponent {

  private RootComponent715 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent715.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent715.class, "root"));
  }

  public RootComponent715 getRoot() {
    return root;
  }

}
