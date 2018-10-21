package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent804
    implements PrybarComponent {

  private RootComponent804 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent804.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent804.class, "root"));
  }

  public RootComponent804 getRoot() {
    return root;
  }

}
