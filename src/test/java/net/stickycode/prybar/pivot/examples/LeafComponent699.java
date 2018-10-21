package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent699
    implements PrybarComponent {

  private RootComponent699 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent699.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent699.class, "root"));
  }

  public RootComponent699 getRoot() {
    return root;
  }

}
