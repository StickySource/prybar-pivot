package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent370
    implements PrybarComponent {

  private RootComponent370 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent370.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent370.class, "root"));
  }

  public RootComponent370 getRoot() {
    return root;
  }

}
