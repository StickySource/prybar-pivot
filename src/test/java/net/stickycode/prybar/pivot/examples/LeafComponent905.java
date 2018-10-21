package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent905
    implements PrybarComponent {

  private RootComponent905 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent905.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent905.class, "root"));
  }

  public RootComponent905 getRoot() {
    return root;
  }

}
