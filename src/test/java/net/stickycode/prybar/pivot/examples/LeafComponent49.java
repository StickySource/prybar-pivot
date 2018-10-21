package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent49
    implements PrybarComponent {

  private RootComponent49 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent49.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent49.class, "root"));
  }

  public RootComponent49 getRoot() {
    return root;
  }

}
