package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent469
    implements PrybarComponent {

  private RootComponent469 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent469.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent469.class, "root"));
  }

  public RootComponent469 getRoot() {
    return root;
  }

}
