package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent24
    implements PrybarComponent {

  private RootComponent24 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent24.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent24.class, "root"));
  }

  public RootComponent24 getRoot() {
    return root;
  }

}
